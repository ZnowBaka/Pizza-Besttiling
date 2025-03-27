package com.example.pizzabesttiling.Services;

import com.example.pizzabesttiling.Entities.Menu;
import com.example.pizzabesttiling.Entities.Pizza;
import com.example.pizzabesttiling.Framework.PizzaRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service

public class MenuService {
    private final Menu menu = new Menu();
    private PizzaRepo pizzaRepo;


    public MenuService(PizzaRepo pizzaRepo) {
        this.pizzaRepo = pizzaRepo;
    }



    public void addAllToMenu() {
        ArrayList<Pizza> pizzas = new ArrayList<>();
        pizzas = (ArrayList<Pizza>) pizzaRepo.getAll();
        System.out.println(pizzas.get(2).toString());
        try {
            for (Pizza pizza : pizzas) {
            //for (int i = 0; i < pizzas.size(); i++) {
                System.out.println(pizza.getPizzaId());
                menu.setMenuList(pizza);
                //System.out.println(menu.getMenuList());
                }
        } catch (Exception e) {
            System.out.println(e + "huh");

        }
    }

    public ArrayList<Pizza> viewMenu() {
        try {
            addAllToMenu();
            return menu.getMenuList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Pizza getPizzaById(int id) {
        return pizzaRepo.getById(id);
    }



}
