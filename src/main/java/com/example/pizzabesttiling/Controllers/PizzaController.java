package com.example.pizzabesttiling.Controllers;

import com.example.pizzabesttiling.Entities.Menu;
import com.example.pizzabesttiling.Entities.Pizza;
import com.example.pizzabesttiling.Services.MenuService;
import com.example.pizzabesttiling.Services.OrderService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PizzaController {
    private final MenuService menuService;
    private final OrderService orderService;

    public PizzaController(MenuService menuService, OrderService orderService) {
        this.menuService = menuService;
        this.orderService = orderService;
    }



    @GetMapping("/")
    public String home(Model model){
        if (menuService.viewMenu().isEmpty()){
            menuService.addAllToMenu();
            model.addAttribute("Menu", menuService.viewMenu());
        } else {
            model.addAttribute("Menu", menuService.viewMenu());
        }

        return "redirect:/pizza";
    }

    @GetMapping("/pizza")
    public String pizza(Model model){
        if (menuService.viewMenu().isEmpty()){
            menuService.addAllToMenu();
            model.addAttribute("Menu", menuService.viewMenu());
        } else {
            model.addAttribute("Menu", menuService.viewMenu());
        }

        return "/pizza";
    }


    @GetMapping("/submit{Id}")
    public String addPizza(Model model, @RequestParam int id){
        Pizza pizza = menuService.getPizzaById(id);
        orderService.addPizzaToOrder(pizza);
        System.out.println(orderService.getOrderPizzaList().size());
        return "redirect:/pizza";
    }









}
