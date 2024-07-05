package edu.myonlineordering.persistence.entity;
import java.sql.Timestamp;

public class Restaurant {
    private int id;
    private String name;
    private String location;
    private int contactNumber;
    private Timestamp createdAt;


    public Restaurant() {}


    public Restaurant(int id, String name, String location, int contactNumber, Timestamp createdAt) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.contactNumber = contactNumber;
        this.createdAt = createdAt;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
