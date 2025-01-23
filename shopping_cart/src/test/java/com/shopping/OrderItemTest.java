package com.shopping;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderItemTest {

    @Test
    public void testConstructor() {
        // Initialize the Product and OrderItem objects inside the test
        Product product = new Product("P001", "Product1", 10, 20);
        OrderItem orderItem = new OrderItem(product, 5);

        // Test the constructor
        assertNotNull(orderItem);
        assertEquals(product, orderItem.getProduct());
        assertEquals(5, orderItem.getQuantity());
    }

    @Test
    public void testGetProduct() {
        // Initialize the Product and OrderItem objects inside the test
        Product product = new Product("P001", "Product1", 10, 20);
        OrderItem orderItem = new OrderItem(product, 5);

        // Test getter for product
        assertEquals(product, orderItem.getProduct());
    }

    @Test
    public void testSetProduct() {
        // Initialize the Product and OrderItem objects inside the test
        Product product = new Product("P001", "Product1", 10, 20);
        OrderItem orderItem = new OrderItem(product, 5);

        // Test setter for product
        Product newProduct = new Product("P002", "Product2", 15, 30);
        orderItem.setProduct(newProduct);
        assertEquals(newProduct, orderItem.getProduct());
    }

    @Test
    public void testGetQuantity() {
        // Initialize the Product and OrderItem objects inside the test
        Product product = new Product("P001", "Product1", 10, 20);
        OrderItem orderItem = new OrderItem(product, 5);

        // Test getter for quantity
        assertEquals(5, orderItem.getQuantity());
    }

    @Test
    public void testSetQuantity() {
        // Initialize the Product and OrderItem objects inside the test
        Product product = new Product("P001", "Product1", 10, 20);
        OrderItem orderItem = new OrderItem(product, 5);

        // Test setter for quantity
        orderItem.setQuantity(10);
        assertEquals(10, orderItem.getQuantity());
    }

    @Test
    public void testSetProductNull() {
        // Initialize the Product and OrderItem objects inside the test
        Product product = new Product("P001", "Product1", 10, 20);
        OrderItem orderItem = new OrderItem(product, 5);

        // Test setter for product with null value
        orderItem.setProduct(null);
        assertNull(orderItem.getProduct());
    }

    @Test
    public void testSetQuantityZero() {
        // Initialize the Product and OrderItem objects inside the test
        Product product = new Product("P001", "Product1", 10, 20);
        OrderItem orderItem = new OrderItem(product, 5);

        // Test setter for quantity with zero value
        orderItem.setQuantity(0);
        assertEquals(0, orderItem.getQuantity());
    }

    @Test
    public void testSetQuantityNegative() {
        // Initialize the Product and OrderItem objects inside the test
        Product product = new Product("P001", "Product1", 10, 20);
        OrderItem orderItem = new OrderItem(product, 5);

        // Test setter for quantity with negative value (if your business logic allows it)
        orderItem.setQuantity(-5);
        assertEquals(-5, orderItem.getQuantity());
    }
}
