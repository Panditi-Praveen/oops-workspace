package com.java.collections;

import java.util.HashSet;

public class SetTest {
    static void main() {
        HashSet<Product> productHashSet = new HashSet<>();
        productHashSet.add(new Product(1,"Iphone16",1228,4.5F,32,(byte)50,true,"Apple","Mobile"));
        productHashSet.add(new Product(2,"Iphone17",1227,4.6F,33,(byte)50,true,"Apple","Mobile"));
        productHashSet.add(new Product(6,"Iphone18",1226,4.7F,35,(byte)50,true,"Apple","Mobile"));
        productHashSet.add(new Product(4,"Iphone17",1225,4.8F,38,(byte)50,true,"Apple","Mobile"));
        productHashSet.add(new Product(5,"Iphone19",1224,4.9F,37,(byte)50,true,"Apple","Mobile"));
        System.out.println(productHashSet);
    }
}
