package com.test;
// Lambda with zero parameters
public class Zero {
    public static void main(String[] args) {
        // Lambda expression with zero parameters
        Runnable greet = () -> System.out.println("Hello, World!");
        
        // Calling the lambda
        greet.run();  // Output: Hello, World!
    }
}
