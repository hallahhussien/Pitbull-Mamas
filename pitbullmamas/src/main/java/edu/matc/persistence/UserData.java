/**package edu.matc.persistence;

import edu.matc.entity.User;
import edu.matc.persistence.Database;

import org.apache.log4j.*;
import org.hibernate.metamodel.relational.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by student on 2/20/17.

public class UserData {

    private final Logger logger = Logger.getLogger(this.getClass());

    public List<User> getUser(String email) {
        List<User> users = new ArrayList<>();
        String sql = "";
        String error = "";
        if (email != null || email != "") {
            sql = "SELECT * FROM users WHERE user_name LIKE '" + email + "'";
            logger.info("email is " + email);
        }

        users = getUserData(sql);
        return users;
    }

    public List<User> getUserData(String sql) {
        logger.debug("In the getUserData method");

        List<User> users = new ArrayList<>();
        Database database = Database.getInstance();
        Connection connection = null;

        try {
            database.connect();
            connection = database.getConnection();
            Statement selectStatement = connection.createStatement();
            ResultSet results = selectStatement.executeQuery(sql);
            while (results.next()) {
                User reader = createUserFromResults(results);
                users.add(reader);
            }
            database.disconnect();
        } catch (SQLException e) {
            logger.error("LoginUser.getUserData() ... SQL Exception: ", e);

        } catch (Exception e) {
            logger.error("LoginUser.getUserData() ... Exception: ", e);
        }
        return users;
    }

    private User createUserFromResults(ResultSet results) throws SQLException {
        logger.debug("In the createUserFromResults method");
        User user = new User();
        user.setLastName(results.getString("lastName"));
        user.setFirstName(results.getString("firstName"));
        user.setEmail(results.getString("email"));
        user.setLocation(results.getString("location"));
        user.setPuppyPicture(results.getString("puppyPicture"));
        return user;
    }

}
*/