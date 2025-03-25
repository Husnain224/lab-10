package com.example.task2.proxy;
public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Image is loaded only when displayed
        System.out.println("\nDisplaying first image:");
        image1.display(); // First time, loads and displays

        System.out.println("\nDisplaying first image again:");
        image1.display(); // No loading, just display

        System.out.println("\nDisplaying second image:");
        image2.display(); // Loads and displays
    }
}
