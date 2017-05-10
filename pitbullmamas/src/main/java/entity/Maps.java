package entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "Maps")
public class Maps {

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "ShelterId")
    private int ShelterId;

    @Column(name = "Latitude")
    private int Latitude;

    @Column(name= "Longitude")
    private int Longitude;

    @Column(name= "ShelterName")
    private String ShelterName;

    @Column(name= "ShelterLink")
    private String ShelterLink;

    public int getShelterId() {
        return ShelterId;
    }

    public void setShelterId(int shelterId) {
        ShelterId = shelterId;
    }

    public int getLatitude() {
        return Latitude;
    }

    public void setLatitude(int latitude) {
        Latitude = latitude;
    }

    public int getLongitude() {
        return Longitude;
    }

    public void setLongitude(int longitude) {
        Longitude = longitude;
    }

    public String getShelterName() {
        return ShelterName;
    }

    public void setShelterName(String shelterName) {
        ShelterName = shelterName;
    }

    public String getShelterLink() {
        return ShelterLink;
    }

    public void setShelterLink(String shelterLink) {
        ShelterLink = shelterLink;
    }




}