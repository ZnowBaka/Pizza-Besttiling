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
    private final PizzaRepo pizzaRepo;

    public MenuService(PizzaRepo pizzaRepo) {
        this.pizzaRepo = pizzaRepo;
    }

    public void addAllToMenu() {
        ArrayList<Pizza> pizzas = new ArrayList<>();
        pizzas = (ArrayList<Pizza>) pizzaRepo.getAll();
        System.out.println(pizzas.get(2).toString()); // should be 0 Ivan
        try {
            for (Pizza pizza : pizzas) {
                // The good ol' dirty switch fix
                switch (pizza.getName()) {
                    case "Empty Pizza slot":
                        pizza.setPizzaId(1);
                        break;
                    case "Hawaii":
                        pizza.setPizzaId(2);
                        break;
                    case "Ivan":
                        pizza.setPizzaId(3);
                        break;
                    case "Karl":
                        pizza.setPizzaId(4);
                        break;
                    case "Italiano":
                        pizza.setPizzaId(5);
                        break;
                    case "Kathrine":
                        pizza.setPizzaId(6);
                        break;
                    case "Jenny":
                        pizza.setPizzaId(7);
                }
                menu.setMenuList(pizza);
            }
            System.out.println(pizzas.get(2).toString()); // should be 3 Ivan
        } catch (Exception e) {
            System.out.println(e + "huh");

        }
    }

    public ArrayList<Pizza> viewMenu() {
        try {
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
