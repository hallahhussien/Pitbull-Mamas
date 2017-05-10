package persistence;

import entity.User;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Student on 2/12/17.
 */
public class UserDao {

    private final Logger logger = Logger.getLogger(this.getClass());

    /**
     * Returnt a list of all users
     *
     * @return All users
     */
    public List<User> getAllUsers() {
        List<User> users = null;
        Session session = null;
        try {
            session = openSession();
            users = session.createCriteria(User.class).list();
        } catch (HibernateException he) {
            logger.error("Hibernate Exception: " + he);
        } catch (Exception e) {
            logger.error("Exception: " + e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return users;
    }

    /**
     * Get a single user for the given id
     *
     * @param id user's id
     * @return UserProfile
     */
    public User getUser(int id) {
        User user = null;
        Session session = null;
        try {
            session = openSession();
            user = (User) session.get(User.class, id);
        } catch (HibernateException he) {
            logger.error("Hibernate Exception: " + he);
        } catch (Exception e) {
            logger.error("Exception: " + e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return user;
    }

    /**
     * Get a single user for the given user name
     *
     * @param userName user's username
     * @return UserProfile
     */
    public User getUserByUserName(String userName) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        User user = null;
        try {
            user = (User) session.createQuery("from entity.User U where U.userName = :userName")
                    .setString("userName", userName)
                    .uniqueResult();
            return user;
        } catch (HibernateException e) {
            logger.error(e.getMessage());
        } finally {
            session.close();
        }
        return user;
    }

    /**
     * Retrieve users by lastname
     *
     * @param userId UserProfile's userName
     * @return UserProfile
     */
    public List<User> getUsersById(int userId) {
        List<User> user = new ArrayList<User>();
        Session session = null;
        try {
            session = openSession();
            Criteria criteria = session.createCriteria(User.class);
            criteria.add(Restrictions.eq("userId", userId));
            user = criteria.list();
        } catch (HibernateException he) {
            logger.error("Hibernate Exception: " + he);
        } catch (Exception e) {
            logger.error("Exception: " + e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return user;
    }

    /**
     * save or update user
     *
     * @param user
     * @return id of the inserted user
     */

    public int addUser(User user) {
        int id = 0;
        Session session = null;
        try {
            session = openSession();
            Transaction transaction = session.beginTransaction();
            id = (int) session.save(user);
            transaction.commit();
        } catch (HibernateException he) {
            logger.error("Hibernate Exception: " + he);
        } catch (Exception e) {
            logger.error("Exception add(): " + e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return id;
    }

    public int addRegisteredUser(String firstName, String lastName, String userName, String userPassword, String location, String puppyName) {
        int id = 0;
        Session session = null;
        try {
            session = openSession();
            Transaction transaction = session.beginTransaction();
            User user = new User();
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setUserName(userName);
            user.setUserPassword(userPassword);
            user.setLocation(location);
            user.setPuppyName(puppyName);

            id = (int) session.save(user);
            transaction.commit();
            logger.info(transaction);
            logger.info("We got here !!");
        } catch (HibernateException he) {
            logger.error("Hibernate Exception: " + he);
        } catch (Exception e) {
            logger.error("Exception addRegiteredUser: " + e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return id;
    }


    public void deleteUser(int userId) {
        Session session = null;
        try {
            session = openSession();
            Transaction transaction = session.beginTransaction();
            User user = (User) session.get(User.class, userId);
            session.delete(user);
            transaction.commit();
        } catch (HibernateException he) {
            logger.error("Exception: " + he);
        } catch (Exception e) {
            logger.error("Exception: " + e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }


    private Session openSession() {
        return SessionFactoryProvider.getSessionFactory().openSession();
    }

}