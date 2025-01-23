package com.shopping; // Include necessary imports
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    
    @Test
    void testGetTotalAmount() {
        Product product1 = new Product("P001", "Product 1", 100, 5);
        Product product2 = new Product("P002", "Product 2", 150, 10);
        
        Customer customer = new Customer("C001", "John Doe");
        Order order = new Order(customer);
        
        order.addItem(new OrderItem(product1, 2));  // 2 * 100
        order.addItem(new OrderItem(product2, 3));  // 3 * 150
        
        double totalAmount = order.getTotalAmount();
        
        // Assuming the total should be 200 + 450 = 650
        assertEquals(650.0, totalAmount, 0.01);
        
        // If you want to store it as an int, cast explicitly
        int totalAmountInt = (int) totalAmount;
        assertEquals(650, totalAmountInt);
    }
}
