package edu.matc.persistence;

import org.apache.log4j.*;

import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;


/**
 * Created by student on 2/20/17.
*/
public class Database {

    //create an object of the class Database
    private static Database instance = new Database();
    private Properties properties;
    private Connection connection;
    private final Logger logger = Logger.getLogger(String.valueOf(this.getClass()));

    //private constructor prevents instantiating this class anywhere else
    private Database() {
        loadProperties();
    }

    private void loadProperties() {
        properties = new Properties();
        try {
            properties.load(this.getClass().getResourceAsStream("/database.properties"));
        } catch (IOException ioe) {
            logger.error("Database.loadProperties() ... cannot load properties file", ioe);
        } catch (Exception e) {
            logger.error("Database.loadProperteris() ...", e);
        }
    }

    //get the only Database object available
    public static Database getInstance() {
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    public void connect() throws Exception {
        if (connection != null) {
            try {
                Class.forName(properties.getProperty("driver"));
            } catch (ClassNotFoundException e) {
            }
        }

    }
}
