package edu.myonlineordering.persistence.entity;

public class RestaurantMenuItem {
    private int restId;
    private int itemId;

    
    public RestaurantMenuItem() {}

    
    public RestaurantMenuItem(int restId, int itemId) {
        this.restId = restId;
        this.itemId = itemId;
    }

    
    public int getRestId() {
        return restId;
    }

    public void setRestId(int restId) {
        this.restId = restId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
}

