package com.japy.pizzashop.web.controller;

import com.japy.pizzashop.persitence.entity.PizzaEntity;
import com.japy.pizzashop.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pizzas")
public class PizzaController {
    private final PizzaService pizzaService;

    @Autowired
    public PizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @GetMapping
    public ResponseEntity<List<PizzaEntity>> getAll(){
        return ResponseEntity.ok(this.pizzaService.getAll());
    }

    @GetMapping("/not_available")
    public ResponseEntity<List<PizzaEntity>> getNotAvailablePizzas(){
        return ResponseEntity.ok(this.pizzaService.getNotAvailablePizzas());
    }
}
