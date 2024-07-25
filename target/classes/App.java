package com.example;

public class App {
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5; // Change this to calculate factorial of a different number
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}