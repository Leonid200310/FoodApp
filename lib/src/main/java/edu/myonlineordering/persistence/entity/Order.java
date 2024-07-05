package edu.myonlineordering.persistence.entity;

import java.sql.Timestamp;

public class Order {
    private int id;
    private int userId;
    private int courierId;
    private int adminId;
    private String status;
    private Timestamp createdAt;

    public Order() {}


    public Order(int id, int userId, int courierId, int adminId, String status, Timestamp createdAt) {
        this.id = id;
        this.userId = userId;
        this.courierId = courierId;
        this.adminId = adminId;
        this.status = status;
        this.createdAt = createdAt;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCourierId() {
        return courierId;
    }

    public void setCourierId(int courierId) {
        this.courierId = courierId;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}

