package persistence;

import entity.Maps;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by student on 5/4/17.
 */
public class MapsDao {
    private final Logger logger = Logger.getLogger(this.getClass());

    public List<Maps> getAllMaps() {
        List<Maps> maps = null;
        Session session = null;
        try {
            session = openSession();
            maps = session.createCriteria(Maps.class).list();
        } catch (HibernateException he) {
            logger.error("Hibernate Exception in getAllMaps(): " + he);
        } catch (Exception e) {
            logger.error("Exception in getAllMaps(): " + e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return maps;
    }


    public Maps getMaps(int id) {
        Maps maps = null;
        Session session = null;
        try {
            session = openSession();
            maps = (Maps) session.get(Maps.class, id);
        } catch (HibernateException he) {
            logger.error("Hibernate Exception in getMapsById(): " + he);
        } catch (Exception e) {
            logger.error("Exception in getMapsById(): " + e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return maps;
    }

    public Maps getMapsByName(String mapsName) {
        Maps maps = null;
        Session session = null;
        try {
            session = openSession();
            maps = (Maps) session.get(Maps.class, mapsName);
        } catch (HibernateException he) {
            logger.error("Hibernate Exception in getMapsByName(): " + he);
        } catch (Exception e) {
            logger.error("Exception in getMapsByName(): " + e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return maps;
    }

    public Maps getMapsByType(String mapsType) {
        Maps maps = null;
        Session session = null;
        try {
            session = openSession();
            maps = (Maps) session.get(Maps.class, mapsType);
        } catch (HibernateException he) {
            logger.error("Hibernate Exception in getMapsByType(): " + he);
        } catch (Exception e) {
            logger.error("Exception in getMapsByType(): " + e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return maps;
    }


    public int addMaps(Maps maps) {
        int id = 0;
        Session session = null;
        try {
            session = openSession();
            Transaction transaction = session.beginTransaction();
            id = (int) session.save(maps);
            transaction.commit();
        } catch (HibernateException he) {
            logger.error("Hibernate Exception in addMaps(): " + he);
        } catch (Exception e) {
            logger.error("Exception in addMaps(): " + e);
        } finally {
            if (session != null) {
                session.close();
            }
        }

        logger.info("returned id: " + id);
        return id;

    }
    private Session openSession() {
        return SessionFactoryProvider.getSessionFactory().openSession();
    }
}
