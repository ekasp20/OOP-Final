package com.nostratech;

public class TestItem {
	public static void main(String[] args) {
        Item chair = new Item("Desk Chair", 30, 55);

        chair.increaseCost();
        chair.increaseCost();
        chair.increaseCost();

        System.out.println("The chair’s profit is now $" + chair.profit());

        chair.setWeight(7);

        Item table = new Item("Picnic Table", 70, 88);
        
        table.increaseCost();
        table.increaseCost();
        table.increaseCost();
        
        System.out.println("The table’s profit is now $" + table.profit());
    }
}

