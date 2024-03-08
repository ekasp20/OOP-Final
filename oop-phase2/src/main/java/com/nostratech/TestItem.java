package com.nostratech;

public class TestItem {
    public static void main(String[] args) {
        
        Item[] items = new Item[5];  
        items[0] = new Item("Desk Chair", 30, 55);
        items[1] = new Item("Picnic Table", 70, 88);
        items[2] = new Item("Laptop", 800, 1200);
        items[3] = new Item("Coffee Maker", 40, 60);
        items[4] = new Item("Smartphone", 300, 500);

        double totalWeight = Item.calculateTotalWeight(items);
        System.out.println("Total weight of all items: " + totalWeight + " kg");

        Item highestPricedItem = Item.findHighestPricedItem(items);
        System.out.println("Item with the highest price: " + highestPricedItem);

        int taxableItemCount = Item.countTaxableItems(items);
        System.out.println("Number of taxable items: " + taxableItemCount);
    }
}


