package com.nostratech;

public class ShoppingCart {
    private static final int MAX_CAPACITY = 10;
    private Item[] items;
    private int itemCount; 

    public ShoppingCart() {
        this.items = new Item[MAX_CAPACITY];
        this.itemCount = 0;
    }

    public void addItem(Item item) {
        if (itemCount < MAX_CAPACITY) {
            items[itemCount] = item; 
            itemCount++;
            System.out.println(item.getName() + " added to the cart.");
        } else {
            System.out.println("Cart is full. Cannot add more items.");
        }
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].getPrice(); 
        }
        return totalPrice;
    }

    public double calculateTotalTax(double taxRate) {
        double totalTax = 0;
        for (int i = 0; i < itemCount; i++) {
            if (items[i].isTaxable()) {
                totalTax += items[i].getPrice() * (taxRate / 100); 
            }
        }
        return totalTax;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Shopping Cart Contents:\n");
        for (int i = 0; i < itemCount; i++) {
            result.append(items[i]).append("\n"); 
        }
        result.append("Total Price: $").append(calculateTotalPrice()).append("\n");
        return result.toString();
    }
}