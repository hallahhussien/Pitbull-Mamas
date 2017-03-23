package edu.matc.persistence;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by student on 3/02/17.
 */
public class UserDaoTest {

    //User product;
    UserDao userDao;

    @Before
    public void setup() {
        userDao = new UserDao();
        //userDao.add(user);
    }
    @Test
    public void getUserOne() throws Exception {
        System.out.println(userDao.getUser(1));

    }
    @Test
    public void getAllUsers() throws Exception {
        System.out.println(userDao.getAllUsers());
    }

    @Test
    public void getUserByEmail() throws Exception {
        System.out.println(userDao.getUserByEmail("hhussien@madisoncollege.edu"));
    }

    @Test
    public void update() throws Exception {
        //User.setFirstName("Harold Russell");
       // userDao.update(User);

    }

    @Test
    public void add() throws Exception {
        // userDao.add(user);
        assertEquals( 1, 1);
    }

    @Test
    public void delete() throws Exception {
        //userDao.delete(1);

    }

}

