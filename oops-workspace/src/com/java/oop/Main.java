package com.java.oop;

public class Main {
    static  void main() {
        Product product; // reference to variable
        product = new Product();
        product. id = 100;
        product.name = "SAMSUNG";
        product.maxRetailPrice = 69000;
        product.rating = 4.0F;
        product.reviewsCount=100;
        product.discountPercentage =70;
        product.isAvailable = true;
        product.company ="SAMSUNG";
        product.category ="PHONE";
        product.displayproductDetails();


        Product product1 = new Product();
        product1.name = "Asus vivobook";
        product1.maxRetailPrice = 52990;
        product1.rating = 4.5f;
        product1.reviewsCount=42;
        product1.discountPercentage =34;
        product1.isAvailable = true;
        product1.company ="Asus";
        product1.category ="Laptop";
        product1.displayproductDetails();

        Product product2 =new Product();
        product2.name = "IPHONE6";
        product2.maxRetailPrice = 23333;
        product2.rating = 3.3F;
        product2.reviewsCount=69;
        product2.discountPercentage =98;
        product2.isAvailable = true;
        product2.company ="IPHONE";
        product2.category ="PHONE";
        product2.displayproductDetails();



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

        product2.displayproductDetails();


        product.displayProductByCompany("Asus");







    }
}
