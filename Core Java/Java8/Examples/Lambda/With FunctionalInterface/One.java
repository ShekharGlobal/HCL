package com.test;

import java.util.function.Function;

// Lambda with one parameter
public class One {
    public static void main(String[] args) {
        // Lambda expression with one parameter
      Function<Integer, Integer> square = x -> x * x;
        
        // Calling the lambda
        System.out.println("Lambda with one parameter (square of 4): " + square.apply(4));  // Output: 16
    }
}
