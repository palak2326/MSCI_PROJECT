package com.shopping;
import java.util.*;
import java.io.IOException;
import java.util.Map;
// import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            // Read product and customer data from CSV files
            Map<String, Product> products = CSVReader.readProducts("shopping_cart\\src\\main\\resources\\ProductInfo.csv");
            Map<String, Customer> customers = CSVReader.readCustomers("shopping_cart\\src\\main\\resources\\CustomerInfo.csv");

            // Create a scanner to get user inputs from the console
            Scanner scanner = new Scanner(System.in);

            // Instantiate ShoppingCart with products, customers, and the scanner
            ShoppingCart cart = new ShoppingCart(products, customers,scanner);

            // Place the order
            cart.placeOrder();
            
        } catch (IOException e) {
            System.out.println("Error reading CSV files: " + e.getMessage());
        }
    }
}
