package com.java.arrays;

public class Customer {
    public int id;
    public String name;
    public long mobile;
    public String email;
    public String gender;
    public byte age;

    public Customer(int id, String name, long mobile, String email, String gender, byte age) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public Customer() {

    }

    public Customer(int i, String s, String s1, String s2, byte b) {
    }

    void displayCustomerDetails(){
        System.out.println("-----------Customers details------------");
        System.out.println("Id: " +id);
        System.out.println("Name: " + name);
        System.out.println("Mobile: " + mobile);
        System.out.println("Email: "+ email);
        System.out.println("Gender: " +gender);
        System.out.println("Age:" + age);
    }
}
