package com.example.task1.facade;
public class PaymentProcessor {
    public boolean processPayment(String customer, double amount) {
        System.out.println("Processing payment of $" + amount + " for " + customer);
        return true; // Simulating successful payment
    }
}
