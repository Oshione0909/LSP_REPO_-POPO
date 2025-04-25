package org.howard.edu.lspfinal.question1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

    @Test
    @DisplayName("Test total cost with empty cart")
    public void testEmptyCartCost() {
        ShoppingCart cart = new ShoppingCart();
        assertEquals(0.0, cart.getTotalCost(), 0.001);
    }

    @Test
    @DisplayName("Test adding a valid item")
    public void testAddValidItem() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Book", 12.99);
        assertEquals(12.99, cart.getTotalCost(), 0.001);
    }

    @Test
    @DisplayName("Test total cost without discount")
    public void testTotalCostNoDiscount() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Item1", 30.0);
        cart.addItem("Item2", 20.0);
        assertEquals(50.0, cart.getTotalCost(), 0.001);
    }

    @Test
    @DisplayName("Test total cost with discount")
    public void testTotalCostWithDiscount() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Item1", 100.0);
        cart.applyDiscountCode("SAVE10");
        assertEquals(90.0, cart.getTotalCost(), 0.001);
    }

    @Test
    @DisplayName("Test removing non-existent item")
    public void testRemoveNonExistentItem() {
        ShoppingCart cart = new ShoppingCart();
        cart.items.remove("GhostItem");
        assertEquals(0.0, cart.getTotalCost(), 0.001);
    }

    @Test
    @DisplayName("Test applying discount code SAVE10")
    public void testApplyDiscount10() {
        ShoppingCart cart = new ShoppingCart();
        cart.applyDiscountCode("SAVE10");
        assertEquals(10.0, cart.getDiscountPercentage(), 0.001);
    }

    @Test
    @DisplayName("Test applying discount code SAVE20")
    public void testApplyDiscount20() {
        ShoppingCart cart = new ShoppingCart();
        cart.applyDiscountCode("SAVE20");
        assertEquals(20.0, cart.getDiscountPercentage(), 0.001);
    }

    @Test
    @DisplayName("Test applying invalid discount code (expect exception)")
    public void testInvalidDiscountCode() {
        ShoppingCart cart = new ShoppingCart();
        assertThrows(IllegalArgumentException.class, () -> {
            cart.applyDiscountCode("SAVE50");
        });
    }

    @Test
    @DisplayName("Test adding item with 0 price (expect exception)")
    public void testAddItemZeroPrice() {
        ShoppingCart cart = new ShoppingCart();
        assertThrows(IllegalArgumentException.class, () -> {
            cart.addItem("Pen", 0.0);
        });
    }

    @Test
    @DisplayName("Test cart size updates correctly after adding/removing items")
    public void testCartSizeUpdate() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Item1", 10.0);
        cart.addItem("Item2", 20.0);
        cart.items.remove("Item1");
        assertEquals(1, cart.items.size());
    }

    @Test
    @DisplayName("Test adding item with negative price (expect exception)")
    public void testAddItemNegativePrice() {
        ShoppingCart cart = new ShoppingCart();
        assertThrows(IllegalArgumentException.class, () -> {
            cart.addItem("Laptop", -500.00);
        });
    }
}
