package com.example.pizzabesttiling.Entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    private ArrayList<Pizza> menuList = new ArrayList<>();

    public ArrayList<Pizza> getMenuList() {
        return menuList;
    }

    public void setMenuList(Pizza pizza) {
        menuList.add(pizza);
    }
}
