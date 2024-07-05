package edu.myonlineordering.persistence.entity;


public class Menu {
    private int id;
    private int restId;
    private String name;
    private String description;

    
    public Menu() {}

    
    public Menu(int id, int restId, String name, String description) {
        this.id = id;
        this.restId = restId;
        this.name = name;
        this.description = description;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRestId() {
        return restId;
    }

    public void setRestId(int restId) {
        this.restId = restId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

