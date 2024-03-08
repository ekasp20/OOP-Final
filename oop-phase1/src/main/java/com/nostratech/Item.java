package com.nostratech;

public class Item {
    private String name;
    private String vendor;
    private double price;
    private double cost;
    private double weight;
    private boolean taxable;

    public Item(String name, double cost, double price) {
        this.name = name;
        this.cost = cost;
        this.price = price;
        this.weight = 1;  
        this.taxable = true;  
    }

    public String getName() {
        return name;
    }

    public String getVendor() {
        return vendor;
    }

    public double getPrice() {
        return price;
    }

    public double getCost() {
        return cost;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isTaxable() {
        return taxable;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setTaxable(boolean taxable) {
        this.taxable = taxable;
    }

    public void increaseCost() {
        cost = cost * 1.05;
    }

    public double profit() {
        return price - cost;
    }
}
