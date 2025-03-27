package com.example.pizzabesttiling.Entities;


import lombok.Getter;

@Getter
public class Pizza{
    // Pizza: Indeholder pizzatyper (navn, beskrivelse, pris, toppings
    private int pizzaId;
    private String imgUrl;
    private String name;
    private String description;
    private double price;
    private int toppingFK01;
    private int toppingFK02;
    private int toppingFK03;
    private int toppingFK04;
    private int toppingFK05;


    public Pizza(){}
    public Pizza(int pizzaId, String imgUrl, String name, String description, double price) {
        this.pizzaId = pizzaId;
        this.imgUrl = imgUrl;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getPizzaId() {
        return pizzaId;
    }

    public void setPizzaId(int pizzaId) {
        this.pizzaId = pizzaId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getToppingFK01() {
        return toppingFK01;
    }

    public void setToppingFK01(int toppingFK01) {
        this.toppingFK01 = toppingFK01;
    }

    public int getToppingFK02() {
        return toppingFK02;
    }

    public void setToppingFK02(int toppingFK02) {
        this.toppingFK02 = toppingFK02;
    }

    public int getToppingFK03() {
        return toppingFK03;
    }

    public void setToppingFK03(int toppingFK03) {
        this.toppingFK03 = toppingFK03;
    }

    public int getToppingFK04() {
        return toppingFK04;
    }

    public void setToppingFK04(int toppingFK04) {
        this.toppingFK04 = toppingFK04;
    }

    public int getToppingFK05() {
        return toppingFK05;
    }

    public void setToppingFK05(int toppingFK05) {
        this.toppingFK05 = toppingFK05;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaId=" + this.getPizzaId() + ", name= " + name +"}";
    }
}
