package com.java.oop;

public class Main {
    static void main(String[] args) {
        //local variable\
        Customer customer = new Customer();
        Product product = new Product(); // Product -> class name,  product -> reference variable
        product.id = 1;
        product.name = "realme TechLife 80 cm (32 inch) QLED HD Ready Smart Google TV (32HDGQRDDAQ)";
        product.rating = 4.3F;
        product.maxRetailPrice = 23999;
        product.discountPercentage = 55;
        product.isAvailable = true;
        product.reviewsCount = 26847;
        product.company = "realme ";
        product.category =  "Tv";

       product.displayproductDetails();

        Product product1 = new Product();
        product1.id = 2;
        product1.name = "Samsung Galaxy S26 Ultra 5G (Black, 512 GB) (12 GB RAM)";
        product1.rating = 4.6F;
        product1.maxRetailPrice = 134499;
        product1.discountPercentage = 16;
        product1.isAvailable = true;
        product1.reviewsCount = 462;
        product1.company = "samsung ";
        product1.category = "mobile";
        product1.displayproductDetails();
        System.out.println("-----------------------------------");

        Product product3 = new Product();
        product3.id = 3;
        product3.name = " IQOO Neo 9 Pro";
        product3.rating = 5.0F;
        product3.maxRetailPrice = 12222;
        product3.discountPercentage = 20;
        product3.isAvailable = true;
        product3.reviewsCount = 666;
        product3.company = "VIVO ";
        product3.category = "mobile";
        product3.displayproductDetails();
        System.out.println("-----------------------------------");



        customer.id = 3;
        customer.name = "tarun";
        customer.email = "tarun@gmail.com";
        customer.age = 24;
        customer.gender = "male";
        customer.mobile = 9305672459L;
        System.out.println("id :" +customer.id);
        System.out.println("name :" +customer.name);
        System.out.println("email :" +customer.email);
        System.out.println("age :" +customer.age);
        System.out.println("gender :" +customer.email);
        System.out.println("mobile number :" +customer.mobile);
        System.out.println("---------------------------------------");


        Customer customer2 = new Customer();
        customer2.id = 4;
        customer2.name = "anil";
        customer2.email = "anil@gmail.com";
        customer2.age = 22;
        customer2.gender = "male";
        customer2.mobile = 8309957523L;
        System.out.println("id :" + customer2.id);
        System.out.println("name :" + customer2.name);
        System.out.println("email :" + customer2.email);
        System.out.println("age :" + customer2.age);
        System.out.println("gender :" + customer2.email);
        System.out.println("mobile number :" + customer2.mobile);
        System.out.println("--------------------------------");


        Customer customer3 = new Customer();
        System.out.println("id :" + customer3.id);
        System.out.println("name :" + customer3.name);
        System.out.println("email :" + customer3.email);
        System.out.println("age :" + customer3.age);
        System.out.println("gender :" + customer3.email);
        System.out.println("mobile number :" + customer3.mobile);
        System.out.println("---------------------------------");


        Customer customer5 = new Customer(111,"Customer5",'M',"dhoni","dhoni@gmail.com",(byte) 23);
        System.out.println("id :" + customer5.id);
        System.out.println("name :" + customer5.name);
        System.out.println("email :" + customer5.email);
        System.out.println("age :" + customer5.age);
        System.out.println("gender :" + customer5.email);
        System.out.println("mobile number :" + customer5.mobile);
        System.out.println("--------------------------------");



        Product product2 = new Product();
        System.out.println("id :" +product2.id);
        System.out.println("name :" +product2.name);
        System.out.println("Max Retail Price :" +product2.maxRetailPrice);
        System.out.println("Is available :" +product2.isAvailable);
        System.out.println("company :" +product2.company);
        System.out.println("category :" +product2.category);
        System.out.println("--------------------------");







        //Order details
        Order order1 = new Order();
        order1.displayOrderDetails();
        System.out.println("----------------------------------------");


        Order order2 = new Order(1001029876L,"21-4-2026","pending",true,false,190267549L,"standard","27-4-2026");
        order2.displayOrderDetails();
        System.out.println("----------------------------------------");


        //payment updated
        Payment payment = new Payment();
        System.out.println("Transaction id :" +payment.transactionId);
        System.out.println("Amount :" +payment.amount);
        System.out.println("Status :" +payment.status);
        System.out.println("Payment mode :" +payment.paymentMode);
        System.out.println("Is Payment Successful :" +payment.isPaymentSuccessful);
        System.out.println("-------------------------------------");

        Payment payment1 = new Payment("TX205678912",1500,"pending","card",false);
        System.out.println("Transaction id :" +payment1.transactionId);
        System.out.println("Amount :" +payment1.amount);
        System.out.println("Status :" +payment1.status);
        System.out.println("Payment mode :" +payment1.paymentMode);
        System.out.println("Is payment Successful :" +payment1.isPaymentSuccessful);
        System.out.println("-----------------------------");


        Cart cart = new Cart();
        System.out.println("Item Added :" +cart.addToCart);
        System.out.println("Cart Updated :" +cart.updateCart);
        System.out.println("Item deleted :" +cart.deleteItem);
        System.out.println("----------------------------");

        Cart cart1 = new Cart();
        System.out.println("Item Added :" +cart1.addToCart);
        System.out.println("Cart Updated :" +cart1.updateCart);
        System.out.println("Item deleted :" +cart1.deleteItem);
        System.out.println("----------------------------");
    }
}
