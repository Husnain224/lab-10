package com.example.task1.facade;
public class ProductCatalog {
    public boolean isProductAvailable(String product) {
        System.out.println("Checking availability for product: " + product);
        return true; // Simulating that the product is always available
    }
}
