package com.japy.pizzashop.service;

import com.japy.pizzashop.persitence.entity.PizzaEntity;
import com.japy.pizzashop.persitence.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaService {
    private final PizzaRepository pizzaRepository;

    @Autowired
    public PizzaService(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public List<PizzaEntity> getAll(){
        return this.pizzaRepository.findAll();
    }

    public PizzaEntity get(int id_pizza){
        return this.pizzaRepository.findById(id_pizza).orElse(null);
    }

    /*public List<PizzaEntity> getNotAvailablePizzas(){
        return this.jdbcTemplate.query("SELECT * FROM PIZZA WHERE available = 0", new BeanPropertyRowMapper<>(PizzaEntity.class));
    }*/
}
