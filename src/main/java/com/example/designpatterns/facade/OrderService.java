package com.example.designpatterns.facade;

public class OrderService {
    public void placeOrder(String item, int quantity) {
        System.out.println("Order placed for " + quantity + " of " + item);
    }
}
