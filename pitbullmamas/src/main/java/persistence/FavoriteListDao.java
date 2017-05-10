package persistence;

import entity.FavoriteList;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


import java.util.List;

/**
 * Created by Mike on 2/14/17.
 */
public class FavoriteListDao {
    private final Logger logger = Logger.getLogger(this.getClass());

    public List<FavoriteList> getAllFavoriteListItems() {
        List<FavoriteList> listItems = null;
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        try {
            listItems = session.createCriteria(FavoriteList.class).list();
        } catch (HibernateException e) {
            logger.error(e.getMessage());
        }finally {
            session.close();
        }

        return listItems;
    }

    public FavoriteList getFavoriteListItem(int id) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        FavoriteList listItem = null;
        try {
            listItem = (FavoriteList) session.get(FavoriteList.class, id);
        } catch (HibernateException e) {
            logger.error(e.getMessage());
        } finally {
            session.close();
        }
        return listItem;
    }

    public int addFavoriteListItem(FavoriteList listItem) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;

        int id = 0;
        try {
            tx = session.beginTransaction();
            id = (int)session.save(listItem);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            logger.error(e.getMessage());
        }finally {
            session.close();
        }

        return id;
    }

    public void deleteFavoriteListItem(int id) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            FavoriteList listItem = (FavoriteList) session.get(FavoriteList.class, id);
            session.delete(listItem);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            logger.error(e.getMessage());
        } finally {
            session.close();
        }
    }

    public void updateFavoriteListItem(FavoriteList listItem) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.update(listItem);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            logger.error(e.getMessage());
        } finally {
            session.close();
        }
    }

    public List<FavoriteList> getFavoriteListByUserID(int userid) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        List<FavoriteList> links = null;
        try {

            links = session.createQuery("from entity.FavoriteList U where U.userId = :userId order by U.productId.name")
                    .setString("userId", String.valueOf(userid))
                    .list();
            return links;
        } catch (HibernateException e) {
            logger.error(e.getMessage());
        } finally {
            session.close();
        }
        return links;
    }

    public FavoriteList getLinkByUserProduct(int userid, int movieid) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        FavoriteList link = null;
        try {

            link = (FavoriteList) session.createQuery("from entity.FavoriteList U where U.userId = :userId and U.productId = :productId")
                    .setString("userId", String.valueOf(userid))
                    .setString("productId", String.valueOf(movieid))
                    .uniqueResult();
            return link;
        } catch (HibernateException e) {
            logger.error(e.getMessage());
        } finally {
            session.close();
        }
        return link;
    }
}