package edu.matc.persistence;


import edu.matc.entity.User;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by STUDENT on 2/12/2017.
 */
public class UserDao {

    private final Logger log = Logger.getLogger(this.getClass());


    public int addUser(User user) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        int user_id = (Integer) session.save(user);
        transaction.commit();
        return user_id;
    }

    public User getUser(int userId) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        User user = null;
        try {
            user = (User)session.get(User.class, userId);
        } catch (Exception exception) {
            log.error("Hibrenate Exception");
        }
        return user;
    }

    public void updateUser(String email) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        User user = null;
        try {

            user = (User)session.get(User.class, email);

        } catch (Exception exception) {

            log.error("Problem with updating user.");
        }
    }

    public void removeUser(int userId) {

    }

    public String getUserByEmail(String email) {
        return email;
    }
}