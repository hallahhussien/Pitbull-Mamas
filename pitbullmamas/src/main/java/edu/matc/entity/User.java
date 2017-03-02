package edu.matc.entity;

/**
 * A class to represent a user.
 * Created by student on 2/12/17.
 */
public class User {
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String location;
    private String puppyPicture;


    /**
     * Instantiates a new User.
     *  @param id unique id
     * @param email email address for the user login
     * @param password to log in and verify  user login
     * @param firstName the first name
     * @param lastName the last name
     * @param location the zip code
     * @param puppyPicture the file path of the puppy image
     */
    public User(int id, String email, String password, String firstName, String lastName, String location, String puppyPicture) {
        this.id = id;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.puppyPicture = puppyPicture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPuppyPicture() {
        return puppyPicture;
    }

    public void setPuppyPicture(String puppyPicture) {
        this.puppyPicture = puppyPicture;
    }



}