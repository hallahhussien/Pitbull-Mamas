package persistence;

import entity.User;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Student on 2/13/17.
 */
public class UserDaoTest {

    private final Logger logger = Logger.getLogger(this.getClass());
    UserDao dao;
    User hallah;

    int newUser = 0;

    @Before
    public void setUp() throws Exception {
        dao = new UserDao();
        hallah = new User();

        hallah.setFirstName("hallah");
        hallah.setLastName("hussien");
        hallah.setUserName("hallah");
        hallah.setUserPassword("1234");
        hallah.setLocation("Here");
        hallah.setPuppyName("Pea");

    }

    @Test
    public void getAllUsers() throws Exception {
        newUser = dao.addUser(hallah);
        List<User> users = dao.getAllUsers();
        assertTrue(users.size() > 0);
    }

    @Test
    public void getUser() throws Exception {
        newUser = dao.addUser(hallah);
        assertNotNull("no user returned", dao.getUser(newUser));
        logger.info("user is: " + dao.getUser(newUser));
        assertEquals("user Id not returned correctly", hallah.getUserId(), dao.getUser(newUser).getUserId());
        assertEquals("first name not returned correctly", hallah.getFirstName(), dao.getUser(newUser).getFirstName());
        assertEquals("last name not returned correctly", hallah.getLastName(), dao.getUser(newUser).getLastName());
        assertEquals("user name not returned correctly", hallah.getUserName(), dao.getUser(newUser).getUserName());
        assertEquals("user password not returned correctly", hallah.getUserPassword(), dao.getUser(newUser).getUserPassword());
        assertEquals("user location not returned correctly", hallah.getLocation(), dao.getUser(newUser).getLocation());
        assertEquals("puppy name not returned correctly", hallah.getPuppyName(), dao.getUser(newUser).getPuppyName());
    }

    @Test
    public void getUsersByUsername() throws Exception {
        logger.info("user firstname is" + dao.getUserByUserName("hallah").getFirstName());
    }


    @Test
    public void addUser() throws Exception {
        newUser = dao.addUser(hallah);

        assertNotEquals("no user added", 0, newUser);
        assertEquals("user Id not returned correctly", hallah.getUserId(), dao.getUser(newUser).getUserId());
        assertEquals("first name not returned correctly", hallah.getFirstName(), dao.getUser(newUser).getFirstName());
        assertEquals("last name not returned correctly", hallah.getLastName(), dao.getUser(newUser).getLastName());
        assertEquals("user name not returned correctly", hallah.getUserName(), dao.getUser(newUser).getUserName());
        assertEquals("user password not returned correctly", hallah.getUserPassword(), dao.getUser(newUser).getUserPassword());
        assertEquals("user location not returned correctly", hallah.getLocation(), dao.getUser(newUser).getLocation());
        assertEquals("puppy name not returned correctly", hallah.getPuppyName(), dao.getUser(newUser).getPuppyName());

    }

    @Test
    public void addUserFromSignUp() throws Exception {
        newUser = dao.addUser(hallah);

        assertNotEquals("no user added from registration", 0, newUser);
        assertEquals("user Id not returned correctly", hallah.getUserId(), dao.getUser(newUser).getUserId());
        assertEquals("first name not returned correctly", hallah.getFirstName(), dao.getUser(newUser).getFirstName());
        assertEquals("last name not returned correctly", hallah.getLastName(), dao.getUser(newUser).getLastName());
        assertEquals("user name not returned correctly", hallah.getUserName(), dao.getUser(newUser).getUserName());
        assertEquals("user password not returned correctly", hallah.getUserPassword(), dao.getUser(newUser).getUserPassword());
        assertEquals("user location not returned correctly", hallah.getLocation(), dao.getUser(newUser).getLocation());
        assertEquals("puppy name not returned correctly", hallah.getPuppyName(), dao.getUser(newUser).getPuppyName());

    }

    @Test
    public void deleteUser() throws Exception {
        dao.addUser(hallah);
        dao.deleteUser(hallah.getUserId());
        assertNull("user not deleted", dao.getUser(hallah.getUserId()));
    }


    @After
    public void cleanup() {
        // clean up temp user for tests
        if (newUser != 0) {
            dao.deleteUser(newUser);
        }
    }


}