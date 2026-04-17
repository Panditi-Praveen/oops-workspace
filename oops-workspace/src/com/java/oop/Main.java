package com.java.oop;

public class Main {
    static  void main() {
        Product product; // reference to variable
        product = new Product();
        product. id = 100;
        product.name = "Asus vivobook";
        product.maxRetailPrice = 52990;
        product.rating = 4.5f;
        product.reviewsCount=42;
        product.discountPercentage =34;
        product.isAvailable = true;
        product.company ="Asus";
        product.category ="Laptop";
        System.out.println("Id :" + product.id);
        System.out.println("NAME :" + product.name);
        System.out.println("MaxRetailPrice :" + product.maxRetailPrice);
        System.out.println("Rating : " + product.rating);
        System.out.println("Reviewscount :" + product.reviewsCount);
        System.out.println("DiscountPercentage: " + product.discountPercentage);
        System.out.println("ISAVAILABLE :" + product.isAvailable);
        System.out.println("COMPANY : "+ product.company);
        System.out.println("Category :" + product.category);

        Product product1 = new Product();
        product1.name = "Asus vivobook";
        product1.maxRetailPrice = 52990;
        product1.rating = 4.5f;
        product1.reviewsCount=42;
        product1.discountPercentage =34;
        product1.isAvailable = true;
        product1.company ="Asus";
        product1.category ="Laptop";
        System.out.println("Id :" + product1.id);
        System.out.println("NAME :" + product1.name);
        System.out.println("MaxRetailPrice :" + product1.maxRetailPrice);
        System.out.println("Rating : " + product1.rating);
        System.out.println("Reviewscount :" + product1.reviewsCount);
        System.out.println("DiscountPercentage: " + product1.discountPercentage);
        System.out.println("ISAVAILABLE :" + product1.isAvailable);
        System.out.println("COMPANY : "+ product1.company);
        System.out.println("Category :" + product1.category);


        Customer customer = new Customer();
        System.out.println("Id :" + customer.id);
        System.out.println("NAME :" + customer.name);
        System.out.println("MOBILE :" + customer.mobile);
        System.out.println("EMAIL : " + customer.email);
        System.out.println("GENDER : " + customer.gender);
        System.out.println("AGE : " + customer.age);

        Customer customer1 = new Customer(1,"praveen",8309957523L,"panditipraveen467@gmail.com","male",(byte)21);
        System.out.println("Id :" + customer1.id);
        System.out.println("NAME :" + customer1.name);
        System.out.println("MOBILE :" + customer1.mobile);
        System.out.println("EMAIL : " + customer1.email);
        System.out.println("GENDER : " + customer1.gender);
        System.out.println("AGE : " + customer1.age);

        Product product2 =new Product();
        System.out.println("Id :" + product2.id);
        System.out.println("NAME :" + product2.name);
        System.out.println("MaxRetailPrice :" + product2.maxRetailPrice);
        System.out.println("Rating : " + product2.rating);
        System.out.println("Reviewscount :" + product2.reviewsCount);
        System.out.println("DiscountPercentage: " + product2.discountPercentage);
        System.out.println("ISAVAILABLE :" + product2.isAvailable);
        System.out.println("COMPANY : "+ product2.company);
        System.out.println("Category :" + product2.category);






    }
}
