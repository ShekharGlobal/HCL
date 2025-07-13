package com.hcl.withoutDI;

public class FoodDeliveryApp {
    public static void main(String[] args) {
        // Create order manually
        Order order = new Order();
        order.processOrder();
    }
}
