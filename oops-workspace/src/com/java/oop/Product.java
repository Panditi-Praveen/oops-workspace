package com.java.oop;

public class Product {
    // instance variable
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

        //display product details
        void displayproductDetails(){
            System.out.println("Id: " + id);
            System.out.println("Name : " + name);
            System.out.println("Max Retail Price : " + maxRetailPrice);
            System.out.println("Rating: " + rating);
            System.out.println("Reviews Count : " +reviewsCount);
            System.out.println("Discount Percentage: " +discountPercentage);
            System.out.println("Is Available : " +isAvailable);
            System.out.println("Company: " +company);
        }
        /*
        no return type with arguments
         */
        void displayProductByCompany(String company){
            System.out.println("Display products by company:" +company);
        }

        void displayProductByCategoryAndManufacturedYear(String category, int manufacturedYear){
            System.out.println("Display products by category and manufactured year: " + category + " " + manufacturedYear);
        }
}
