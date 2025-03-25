package com.example.task1.facade;
public class ShoppingFacade {
    private ProductCatalog catalog;
    private PaymentProcessor payment;
    private OrderManager orderManager;

    public ShoppingFacade() {
        this.catalog = new ProductCatalog();
        this.payment = new PaymentProcessor();
        this.orderManager = new OrderManager();
    }

    public void placeOrder(String customer, String product, double amount) {
        System.out.println("\n--- Processing Order ---");

        if (catalog.isProductAvailable(product)) {
            if (payment.processPayment(customer, amount)) {
                orderManager.placeOrder(customer, product);
                System.out.println("Order successfully completed!");
            } else {
                System.out.println("Payment failed!");
            }
        } else {
            System.out.println("Product is out of stock!");
        }

        System.out.println("--- Order Process Completed ---\n");
    }
}
