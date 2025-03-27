package com.example.pizzabesttiling.Controllers;

import com.example.pizzabesttiling.Entities.Menu;
import com.example.pizzabesttiling.Services.MenuService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PizzaController {
    private final MenuService menuService;

    public PizzaController(MenuService menuService) {
        this.menuService = menuService;
    }



    @GetMapping("/")
    public String home(Model model){

        model.addAttribute("Menu", menuService.viewMenu());
        return "redirect:/pizza";
    }

    @GetMapping("/pizza")
    public String pizza(Model model){
        System.out.println(menuService.getPizzaById(5));
        model.addAttribute("Menu", menuService.viewMenu());
        return "/pizza";
    }



}
