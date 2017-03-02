package edu.matc.entity;


import org.hibernate.annotations.GenericGenerator;


import javax.persistence.*;

/**
 * Created by Student on 2/12/2017.
 */
@Entity
@Table(name="user")
public class User {



    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "user_id")
    private int userId;

    @Column(name = "user_password")
    private String userPassword;

    @Column(name = "user_email")
    private String userEmailAddress;



    public User() {

    }


    public User(String userPassword, String userEmailAddress) {
        this.userPassword = userPassword;
        this.userEmailAddress = userEmailAddress;
    }

    public int getUserId() {

        return userId;
    }

    public String getUserPassword() {

        return userPassword;
    }

    public void setUserPassword(String userPassword) {

        this.userPassword = userPassword;
    }


    public String getUserEmailAddress() {

        return userEmailAddress;
    }

    public void setUserEmailAddress(String userEmailAddress) {

        this.userEmailAddress = userEmailAddress;
    }
}