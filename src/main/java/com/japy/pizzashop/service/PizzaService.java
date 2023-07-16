package com.japy.pizzashop.service;

import com.japy.pizzashop.persitence.entity.PizzaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaService {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PizzaService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<PizzaEntity> getAll(){
        return this.jdbcTemplate.query("SELECT * FROM PIZZA", new BeanPropertyRowMapper<>(PizzaEntity.class));
    }

    public List<PizzaEntity> getNotAvailablePizzas(){
        return this.jdbcTemplate.query("SELECT * FROM PIZZA WHERE available = 0", new BeanPropertyRowMapper<>(PizzaEntity.class));
    }
}
