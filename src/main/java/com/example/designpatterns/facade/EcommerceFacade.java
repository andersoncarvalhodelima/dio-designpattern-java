package com.example.designpatterns.facade;

public class EcommerceFacade {
    private OrderService orderService;
    private PaymentService paymentService;
    private ShippingService shippingService;

    public EcommerceFacade() {
        orderService = new OrderService();
        paymentService = new PaymentService();
        shippingService = new ShippingService();
    }

    public void completeOrder(String item, int quantity, String paymentType, double amount) {
        orderService.placeOrder(item, quantity);
        paymentService.processPayment(paymentType, amount);
        shippingService.shipOrder(item);
        System.out.println("Order completed for " + item);
    }
}
