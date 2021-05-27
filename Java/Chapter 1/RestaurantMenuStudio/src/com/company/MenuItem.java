package com.company;


public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean newItem;

    public MenuItem(double price, String description, String category, boolean newItem) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = newItem;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public boolean isNewItem() {
        return newItem;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNewItem(boolean newItem) {
        this.newItem = newItem;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}