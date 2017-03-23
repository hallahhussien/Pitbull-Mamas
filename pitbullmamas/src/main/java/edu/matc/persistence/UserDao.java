package edu.matc.persistence;

import edu.matc.entity.User;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by paulawaite on 2/2/16.
 */
public class UserDao {

    private final Logger log = Logger.getLogger(this.getClass());

    /** Return a list of all products
     *
     * @return All products
     */
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        users = session.createCriteria(User.class).list();
        return users;
    }

    /** Get a single products for the given id
     *
     * @param userId products's id
     * @return Product
     */
    public User getUser(int userId) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        User user = (User) session.get(User.class, userId);
        return user;
    }

    /** Retrieve User by Email
     *
     * @param email user's email which is the search criteria
     * @return User
     */
    public List<User> getUserByEmail(String email) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(User.class);
        criteria.add(Restrictions.eq("email", email));
        return criteria.list();
    }

    /** save or update User
     * @param user
     * @return userId of the user
     */

    public int update(User user) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        int userId = (int)session.save(user);
        transaction.commit();
        return userId;
    }

    public int add(User user) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        session.beginTransaction();

        //Add new product object
        user.getUserId();
        user.getFirstName();
        user.getLastName();
        user.getEmail();
        user.getPassword();
        user.getLocation();
        user.getImage();
        user.getRole();

        //Save the employee in database
        session.save(user);

        //Commit the transaction
        session.getTransaction().commit();

        return user.getUserId();

    }

    public void delete(int userId) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        User user = (User) session.get(User.class, userId);
        session.delete(user);
        session.flush();
    }

}