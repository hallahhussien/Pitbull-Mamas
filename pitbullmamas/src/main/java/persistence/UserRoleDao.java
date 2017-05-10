package persistence;

import entity.UserRole;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by Student on 3/25/17.
 */
public class UserRoleDao {

    private final Logger logger = Logger.getLogger(this.getClass());

    public List<UserRole> getAllUserRole() {
        List<UserRole> userRole = null;
        Session session = null;

        try {
            session = openSession();
            userRole = session.createCriteria(UserRole.class).list();
        } catch (HibernateException he) {
            logger.error("Hibernate Exception in getAllUserRole(): " + he);
        } catch (Exception e) {
            logger.error("Exception in getAllUserRole(): " + e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return userRole;

    }

    public UserRole getUserRole(int id) {
        Session session = null;
        UserRole userRole = null;

        try {
            session = openSession();
            userRole = (UserRole) session.get(UserRole.class, id);
        } catch (HibernateException e) {
            logger.error("Hibernate Exception", e);
        } catch (Exception e) {
            logger.error("Exception in getUserRole(): " + e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return userRole;
    }

    public int addRole(UserRole userRole) {
        int id = 0;
        Session session = null;

        try {
            session = openSession();
            Transaction transaction = session.beginTransaction();
            id = (int) session.save(userRole);
            transaction.commit();
        } catch (HibernateException he) {
            logger.error("Hibernate Exception in addRole(): " + he);
        } catch (Exception e) {
            logger.error("Exception in addRole(): " + e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return id;
    }

    public void deleteRole(int id) {
        Session session = null;

        try {
            session = openSession();
            Transaction transaction = session.beginTransaction();
            UserRole userRole = (UserRole) session.get(UserRole.class, id);
            session.delete(userRole);
            transaction.commit();
        } catch (HibernateException he) {
            logger.error("Hibernate Exception in deleteRole(): " + he);
        } catch (Exception e) {
            logger.error("Exception in deleteRole(): " + e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public void updateRole(UserRole userRole) {
        Session session = null;

        try {
            session = openSession();
            Transaction transaction = session.beginTransaction();
            session.update(userRole);
            transaction.commit();
        } catch (HibernateException he) {
            logger.error("Hibernate Exception in updateRole(): " + he);
        } catch (Exception e) {
            logger.error("Exception in updateRole(): " + e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public UserRole getRoleByUserName(String user) {
        Session session = null;
        UserRole role = null;

        try {
            session = openSession();
            role = (UserRole) session.createQuery("from entity.UserRole U where U.user_name = :username")
                    .setString("username", user)
                    .uniqueResult();
            logger.info("role return is: " + role);
            return role;
        } catch (HibernateException he) {
            logger.error("Hibernate Exception in getRoleByUserName(): " + he);
        } catch (Exception e) {
            logger.error("Exception in getRoleByUserName(): " + e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return role;
    }

    private Session openSession() {
        return SessionFactoryProvider.getSessionFactory().openSession();
    }

}