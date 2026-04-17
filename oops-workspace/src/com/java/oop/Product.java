package com.java.oop;

public class Product {

    int id;
    String name;
    int maxRetailPrice;
    float rating;
    int reviewsCount;
    byte discountPercentage;
    boolean isAvailable;
    String company;
    String category;
    public Product(){
        System.out.println("Product Constructor called");
        this.id=121;
        this.name="asuslaptop";
        this.maxRetailPrice =999;
        this.reviewsCount = 34;
        this.discountPercentage = 50;
        this.isAvailable = true;
        this.company = "asus";
        this.category ="laptop";
    }

    public Product(int id, String name, int maxRetailPrice, float rating, int reviewsCount, byte discountPercentage, boolean isAvailable, String company, String category) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.rating = rating;
        this.reviewsCount = reviewsCount;
        this.discountPercentage = discountPercentage;
        this.isAvailable = isAvailable;
        this.company = company;
        this.category = category;
    }
}
