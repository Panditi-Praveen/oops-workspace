package com.java.exception;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = scanner.nextInt();
        System.out.println("Enter num2:");
        int num2 = scanner.nextInt();
        try {
            System.out.println("Results: " + num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        int[] arr = new int[5];
        try {
            arr[10] = 64;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }
}
