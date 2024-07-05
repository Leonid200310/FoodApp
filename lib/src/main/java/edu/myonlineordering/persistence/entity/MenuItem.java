package edu.myonlineordering.persistence.entity;

public class MenuItem {
    private int id;
    private int menuId;
    private String name;
    private String description;
    private int price;
    private int categoryId;


    public MenuItem() {}


    public MenuItem(int id, int menuId, String name, String description, int price, int categoryId) {
        this.id = id;
        this.menuId = menuId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.categoryId = categoryId;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}

