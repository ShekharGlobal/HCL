package com.test;

import java.util.function.BiFunction;

// Lambda with two parameters
public class Two {
    public static void main(String[] args) {
        // Lambda expression with two parameters
       BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        
        // Calling the lambda
        System.out.println("Lambda with two parameters (sum of 3 and 5): " + add.apply(3, 5));  // Output: 8
    }
}
