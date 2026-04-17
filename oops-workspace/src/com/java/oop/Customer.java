package com.java.oop;

public class Customer {
    int id;
    String name;
    long mobile;
    String email;
    String gender;
    byte age;
   public Customer() {
        System.out.println("Customer constructor called");

        this.id = 111;
        this.name = "praveen";
        this.mobile = 8309957523L;
        this.email = "panditipraveen467@gmail.com";
        this.gender = "male";
        this.age = 20;
    }

    public Customer(int id, String name, long mobile, String email, String gender, byte age) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }
}
