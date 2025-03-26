package com.example.pizzabesttiling.Framework;

import com.example.pizzabesttiling.Entities.Pizza;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PizzaRepo {

    private final JdbcTemplate jdbcTemplate;
    public PizzaRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<Pizza> getAll() {
        String sql = "select * from pizza";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Pizza.class));
    }
    public Pizza getById(int id) {
        String sql = "select * from pizza where id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Pizza.class), id);
    }
}
