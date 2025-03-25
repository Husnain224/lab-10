package com.example.task3.adapter;
public class Main {
    public static void main(String[] args) {
        OldPaymentGateway oldPayment = new OldPaymentGateway();

        // Using the adapter to make OldPaymentGateway compatible
        NewPaymentGateway adapter = new PaymentAdapter(oldPayment);

        // Making a payment using the new system interface
        adapter.processPayment("husnain  safdar" , 250.75);
    }
}
