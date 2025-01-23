package com.shopping;

import java.util.Map;
import java.util.Scanner;

public class ShoppingCart {
    private Map<String, Product> products;
    private Map<String, Customer> customers;
    private Scanner scanner; // Make scanner a field for dependency injection

    // Constructor now accepts a Scanner to allow mocking in tests
    public ShoppingCart(Map<String, Product> products, Map<String, Customer> customers, Scanner scanner) {
        this.products = products;
        this.customers = customers;
        this.scanner = scanner; // Inject scanner
    }

    public void placeOrder() {
        // Use the injected scanner
        System.out.print("Enter customer ID: ");
        String customerId = scanner.nextLine();
        Customer customer = customers.get(customerId);
        if (customer == null) {
            System.out.println("Customer not found!");
            return;
        }

        Order order = new Order(customer);
        while (true) {
            System.out.print("Enter product ID (or 'done' to finish): ");
            String productId = scanner.nextLine();
            if (productId.equals("done")) break;

            Product product = products.get(productId);
            if (product == null) {
                System.out.println("Product not found!");
                continue;
            }

            System.out.print("Enter quantity: ");
            int quantity = Integer.parseInt(scanner.nextLine());
            if (quantity > product.getQuantity()) {
                System.out.println("Quantity not available");
                continue;
            }

            order.addItem(new OrderItem(product, quantity));
            product.setQuantity(product.getQuantity() - quantity);
        }

        System.out.println("Order placed successfully!");
        System.out.println("Total amount: " + order.getTotalAmount());
    }
}
