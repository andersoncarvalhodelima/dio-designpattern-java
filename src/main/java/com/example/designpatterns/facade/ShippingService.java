package com.example.designpatterns.facade;

public class ShippingService {
    public void shipOrder(String item) {
        System.out.println("Shipped " + item);
    }
}
