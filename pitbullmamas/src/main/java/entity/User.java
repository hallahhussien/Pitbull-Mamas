package entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Student on 2/12/2017.
 */
@Entity
@Table(name="user")
public class User implements Serializable {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "userId")
    private int userId;

    @Column(name = "userName")
    private String userName;

    @Column(name = "userPassword")
    private String userPassword;

    @Column(name = "user_role")
    private String userRole;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "location")
    private String location;

    @Column(name = "puppyName")
    private String puppyName;

    @Column(name = "puppyPhoto")
    private String puppyPhoto;

  // private Set<FavoriteList> favoritelist = new HashSet<FavoriteList>(0);



    public User(int userId, String userName, String userPassword, String userRole, String firstName, String lastName, String location, String puppyName) {
        this.userId = userId;
        this.userName = userName;
        this.userRole = userRole;
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.puppyName = puppyName;

    }

    public User() {

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
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

    public String getPuppyName() {
        return puppyName;
    }

    public void setPuppyName(String puppyName) {
        this.puppyName = puppyName;
    }

    public String getPuppyPhoto() {
        return puppyPhoto;
    }

//    public void setPuppyPhoto(String puppyPhoto) {
//        this.puppyPhoto = puppyPhoto;
//    }
//
//    @Access(AccessType.PROPERTY)
//    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = FavoriteProducts.class)
//    @JoinTable(name = "favoriteproducts",
//            joinColumns = {@JoinColumn(name = "userId", nullable = false, updatable = false)},
//            inverseJoinColumns = {@JoinColumn(name = "favoriteId", nullable = false, updatable = false) })
//    public Set<FavoriteProducts> getFavoriteProducts() {
//        return this.favorites;
//    }
//
//    public void setServices(Set<FavoriteProducts> favorites) {
//        this.favorites = favorites;
//    }

}
