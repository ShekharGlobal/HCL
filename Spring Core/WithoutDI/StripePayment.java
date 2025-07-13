package com.hcl.withoutDI;

public class StripePayment extends Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing payment via Stripe...");
    }
}
