package com.example.task1.facade;
//husnsin safdar//
public class Main {
    public static void main(String[] args) {
        ShoppingFacade shoppingFacade = new ShoppingFacade();

        // Placing an order
        shoppingFacade.placeOrder("husnain safdar", "Laptop", 1200.50);
    }
}

