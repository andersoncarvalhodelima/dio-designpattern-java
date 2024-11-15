package com.example.designpatterns.facade;

public class PaymentService {
    public void processPayment(String paymentType, double amount) {
        System.out.println("Processed payment of " + amount + " using " + paymentType);
    }
}
