package com.company;

public class Invoce {
    private String name;
    private double price;
    private int quntity;
    private double cost;

    public Invoce() {
    }

    public Invoce(String name, double price, int quntity, double cost) {
        this.name = name;
        this.price = price;
        this.quntity = quntity;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuntity() {
        return quntity;
    }

    public void setQuntity(int quntity) {
        this.quntity = quntity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double total(){
        return price * quntity;
    }
}
