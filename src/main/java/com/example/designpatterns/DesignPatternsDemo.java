package com.example.designpatterns;

import com.example.designpatterns.singleton.Singleton;
import com.example.designpatterns.strategy.CreditCardPayment;
import com.example.designpatterns.strategy.PaypalPayment;
import com.example.designpatterns.strategy.ShoppingCart;
import com.example.designpatterns.facade.EcommerceFacade;

public class DesignPatternsDemo {
    public static void main(String[] args) {
        // Singleton Usage
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        // Strategy Usage
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkout(100);

        cart.setPaymentStrategy(new PaypalPayment("user@example.com"));
        cart.checkout(200);

        // Facade Usage
        EcommerceFacade ecommerceFacade = new EcommerceFacade();
        ecommerceFacade.completeOrder("Laptop", 1, "Credit Card", 1500.00);
    }
}