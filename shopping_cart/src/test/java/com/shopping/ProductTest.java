package com.shopping;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    public void testConstructor() {
        // Initialize the Product object inside the test
        Product product = new Product("P001", "Product1", 20, 100);

        // Test that the constructor initializes the Product object correctly
        assertNotNull(product);
        assertEquals("P001", product.getId(), "The product ID should be initialized correctly.");
        assertEquals("Product1", product.getName(), "The product name should be initialized correctly.");
        assertEquals(20, product.getPrice(), "The product price should be initialized correctly.");
        assertEquals(100, product.getQuantity(), "The product quantity should be initialized correctly.");
    }

    @Test
    public void testGetters() {
        // Initialize the Product object inside the test
        Product product = new Product("P001", "Product1", 20, 100);

        // Test getter methods
        assertEquals("P001", product.getId(), "The getId() method should return the correct ID.");
        assertEquals("Product1", product.getName(), "The getName() method should return the correct name.");
        assertEquals(20, product.getPrice(), "The getPrice() method should return the correct price.");
        assertEquals(100, product.getQuantity(), "The getQuantity() method should return the correct quantity.");
    }

    @Test
    public void testSetters() {
        // Initialize the Product object inside the test
        Product product = new Product("P001", "Product1", 20, 100);

        // Test setter methods by modifying the properties of the product
        product.setId("P002");
        product.setName("Product2");
        product.setPrice(30);
        product.setQuantity(200);

        // Assert that the setters update the fields correctly
        assertEquals("P002", product.getId(), "The product ID should be updated correctly.");
        assertEquals("Product2", product.getName(), "The product name should be updated correctly.");
        assertEquals(30, product.getPrice(), "The product price should be updated correctly.");
        assertEquals(200, product.getQuantity(), "The product quantity should be updated correctly.");
    }

    @Test
    public void testSetPriceToNegative() {
        // Initialize the Product object inside the test
        Product product = new Product("P001", "Product1", 20, 100);

        // Test setter for price with a negative value (if business logic allows it)
        product.setPrice(-10);
        assertEquals(-10, product.getPrice(), "The product price should be updated to the negative value.");
    }

    @Test
    public void testSetQuantityToZero() {
        // Initialize the Product object inside the test
        Product product = new Product("P001", "Product1", 20, 100);

        // Test setter for quantity with a zero value
        product.setQuantity(0);
        assertEquals(0, product.getQuantity(), "The product quantity should be updated to zero.");
    }

    @Test
    public void testSetQuantityToNegative() {
        // Initialize the Product object inside the test
        Product product = new Product("P001", "Product1", 20, 100);

        // Test setter for quantity with a negative value (if your business logic allows it)
        product.setQuantity(-5);
        assertEquals(-5, product.getQuantity(), "The product quantity should be updated to the negative value.");
    }
}
