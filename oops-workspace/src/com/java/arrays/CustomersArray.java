package com.java.arrays;

public class CustomersArray {
    static void main() {
        Customer[] customers = new Customer[5];
        customers[0] = new Customer(1, "customer1", 8309957523L, "customer1@gmail.com", "Male", (byte) 20);
        customers[1] = new Customer(1, "customer2", 1234567891L, "customer2@gmail.com", "Male", (byte) 21);
        customers[2] = new Customer(3, "customer3", 7894561233L, "customer3@gmail.com", "female", (byte) 22);
        customers[3] = new Customer(4, "customer4", 4561237891L, "customer4@gmail.com", "female", (byte) 24);
        customers[4] = new Customer(5, "customer5", 7894566541L, "customer5@gmail.com", "Male", (byte) 49);

        for (Customer customer : customers) {
            customer.displayCustomerDetails();
        }

        //find the customer with highest age
        Customer highestAgeCustomer = customers[0];

        for (Customer customer : customers) {
            if (customer.age > highestAgeCustomer.age) {
                highestAgeCustomer = customer;

            }
        }
        highestAgeCustomer.displayCustomerDetails();
        System.out.println("Male customer count:" + getMaleCustomerCount(customers));
    }
        public static int getMaleCustomerCount(Customer[] customers){
            int maleCount = 0;
            for (Customer customer : customers) {
                if (customer.gender == "Male") {
                    maleCount++;
                }
            }
            return maleCount;
        }
    }

