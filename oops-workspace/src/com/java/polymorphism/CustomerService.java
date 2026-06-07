package com.java.polymorphism;

import com.java.inheritance.Customer;

public class CustomerService {

    public Customer add(Customer customer){
        System.out.println( "service:" +customer);
        return customer;
    }

    public void displayCustomerDetails(Customer customer){
        customer.displayDetails();
    }


}
