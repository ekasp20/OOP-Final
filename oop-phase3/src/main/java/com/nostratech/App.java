package com.nostratech;

public class App {

	 public static void main(String[] args) {
	        ShoppingCart cart = new ShoppingCart();

	        Item chair = new Item("Desk Chair", 30, 55);
	        Item table = new Item("Picnic Table", 70, 88);

	        cart.addItem(chair);
	        cart.addItem(table);

	        System.out.println(cart);

	        double taxRate = 8;
	        System.out.println("Total Tax Amount: $" + cart.calculateTotalTax(taxRate));
	    }
	}


