package com.shopping;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test
    void testPlaceOrderSuccess() {
        // Set up mock products and customers for testing
        Map<String, Product> products = new HashMap<>();
        Map<String, Customer> customers = new HashMap<>();

        // Mock customer
        Customer customer = new Customer("1", "John Doe");
        customers.put("1", customer);

        // Mock product
        Product product = new Product("p1", "Laptop", 5, 1000);
        products.put("p1", product);

        // Create a string representing the inputs
        String input = "1\np1\n3\ndone\n";  // Simulated user inputs
        
        // Create an InputStream from the string
        Scanner scanner = new Scanner(new java.io.ByteArrayInputStream(input.getBytes()));

        // Instantiate ShoppingCart with mock data and scanner injected
        ShoppingCart shoppingCart = new ShoppingCart(products, customers, scanner);

        // Place the order
        shoppingCart.placeOrder();

        // Validate the updated product quantity
        assertEquals(997, product.getQuantity()); // Quantity should be reduced by 2 (5 - 2)
    }

    // Other tests as needed
}
