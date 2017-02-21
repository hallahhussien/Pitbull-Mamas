package edu.matc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import java.time.LocalDate;

/**
 * A class to represent a user.
 * @author Hallah
 *
 */
@Entity
@Table(name = "users")
public class User {

    @userId
    @GeneratedValue(generator="increment")
    @Column(name = "userId")
    private int userId;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "locatedIn")
    private String location;


    @SuppressWarnings("Since15")
    @Column(name = "last_updated")
    private LocalDate last_updated;

    /**
     * Empty constructor
     */
    public User() {

    }

    /**
     * Constructor that takes in four parameters to immediately set
     * to the User's instance variables
     * @param id
     * @param firstName
     * @param lastName
     * @param email
     * @param password
     * @param location
     * @param last_updated
     */
    public User(int id, String firstName, String lastName, String email, String password, String location, LocalDate last_updated) {
        this.userId = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.location = location;
        this.last_updated = last_updated;
    }

    /**
     * Getter for id
     * @return the user's id
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Setter for id
     * @param userId the user's soon-to-be id
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * Getter for first name
     * @return the user's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for first name
     * @param firstName the user's soon-to-be first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for last name
     * @return the user's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for last name
     * @param lastName the user's soon-to-be last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Setter for email
     * @param email the user's email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for email
     * @return the user's email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter for password
     * @param password the user's password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter for password
     * @return the user's password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter for location
     * @param location the user's password
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Getter for password
     * @return the user's password
     */
    public String getLocation() {
        return location;
    }



}
