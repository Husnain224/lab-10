package com.example.task3.adapter;
public class PaymentAdapter implements NewPaymentGateway {
    private OldPaymentGateway oldPaymentGateway;

    public PaymentAdapter(OldPaymentGateway oldPaymentGateway) {
        this.oldPaymentGateway = oldPaymentGateway;
    }

    @Override
    public void processPayment(String customer, double amount) {
        System.out.println("Using Adapter: Converting processPayment() to payWithCard().");
        oldPaymentGateway.payWithCard(customer, amount);
    }
}
