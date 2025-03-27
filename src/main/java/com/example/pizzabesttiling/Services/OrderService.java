package com.example.pizzabesttiling.Services;

import com.example.pizzabesttiling.Entities.Order;
import com.example.pizzabesttiling.Entities.Pizza;
import com.example.pizzabesttiling.Framework.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OrderService {
    private Order order;
    private OrderRepository orderRepository;
    private PizzaService pizzaService;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public double getOrderTotal() {
        double total = 0;
        for(Pizza pizza : order.getOrderPizzaList()){
            total += pizza.getPrice();
        }
    return total;
    }

    public void addPizzaToOrder(Pizza pizza) {
        order.setOrderPizzaList(pizza);
    }
    public ArrayList<Pizza> getOrderPizzaList() {
        return this.order.getOrderPizzaList();
    }

}
