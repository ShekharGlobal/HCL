package com.hcl.withoutDI;

public class Order {
    private Payment payment;
    private Delivery delivery;

    public Order() {
    	//Traditional Approach
        // Directly creating dependencies (tight coupling)
        this.payment = new Payment();
        this.payment = new StripePayment();// Overwrites the previous Payment()
        this.delivery = new Delivery();
    }

    public void processOrder() {
        payment.processPayment();
        delivery.scheduleDelivery();
    }
}
