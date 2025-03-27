package com.example.pizzabesttiling.Framework;

import com.example.pizzabesttiling.Entities.Order;
import com.example.pizzabesttiling.Entities.Pizza;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
    private final JdbcTemplate jdbcTemplate;

    public OrderRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Order order) {
        String sql = "INSERT INTO orders (name, phone_number, price, pizzaFK01, pizzaFK02, pizzaFK03, pizzaFK04, pizzaFK05) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, order.getName(), order.getPhoneNumber(), order.getPrice(), order.getOrderPizzaList().get(0).getPizzaId(), order.getOrderPizzaList().get(1).getPizzaId(), order.getOrderPizzaList().get(2).getPizzaId(), order.getOrderPizzaList().get(3).getPizzaId(), order.getOrderPizzaList().get(4).getPizzaId());
    }
}
