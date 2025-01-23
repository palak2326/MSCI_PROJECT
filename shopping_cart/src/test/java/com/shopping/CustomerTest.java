package com.shopping;  // Include necessary imports

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    @Test
    public void testConstructor() {
        // Initialize customer inside the test
        Customer customer = new Customer("C001", "John Doe");

        // Test that the constructor initializes the customer correctly
        assertNotNull(customer);
        assertAll("customer",
            () -> assertEquals("C001", customer.getId()),
            () -> assertEquals("John Doe", customer.getName())
        );
    }

    @Test
    public void testGetters() {
        // Initialize customer inside the test
        Customer customer = new Customer("C0011", "John Doe");

        // Test getter methods
        assertAll("getters",
            () -> assertEquals("C0011", customer.getId()),
            () -> assertEquals("John Doe", customer.getName())
        );
    }

    @Test
    public void testSetters() {
        // Initialize customer inside the test
        Customer customer = new Customer("C001", "John Doe");

        // Test setter methods
        customer.setId("C002");
        customer.setName("Jane Smith");

        assertAll("setters",
            () -> assertEquals("C002", customer.getId()),
            () -> assertEquals("Jane Smith", customer.getName())
        );
    }

    @Test
    public void testSetName() {
        // Initialize customer inside the test
        Customer customer = new Customer("C001", "John Doe");

        // Test setter for name
        customer.setName("Alice Johnson");
        assertEquals("Alice Johnson", customer.getName());
    }

    @Test
    public void testSetId() {
        // Initialize customer inside the test
        Customer customer = new Customer("C001", "John Doe");

        // Test setter for ID
        customer.setId("C003");
        assertEquals("C003", customer.getId());
    }
}
