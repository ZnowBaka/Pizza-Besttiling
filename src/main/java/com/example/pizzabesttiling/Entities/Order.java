package com.example.pizzabesttiling.Entities;

import java.util.ArrayList;

public class Order {
    private int id;
    private String name;
    private int phoneNumber;
    private double price;
    private ArrayList<Pizza> orderPizzaList;

    public Order(int id, String name, int phoneNumber, double price, ArrayList<Pizza> orderPizzaList) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.price = price;
        this.orderPizzaList = new ArrayList<>(orderPizzaList);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<Pizza> getOrderPizzaList() {
        return orderPizzaList;
    }

    public void setOrderPizzaList(ArrayList<Pizza> orderPizzaList) {
        this.orderPizzaList = orderPizzaList;
    }
    public void setOrderPizzaList(Pizza pizza) {
        this.orderPizzaList.add(pizza);
    }
}
