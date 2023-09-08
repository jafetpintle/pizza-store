package com.japy.pizzashop.web.controller;

import com.japy.pizzashop.persitence.entity.OrderEntity;
import com.japy.pizzashop.persitence.projection.OrderSummary;
import com.japy.pizzashop.service.OrderService;
import com.japy.pizzashop.service.dto.RandomOrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public ResponseEntity<List<OrderEntity>> getdAll(){
        return ResponseEntity.ok(this.orderService.getAll());
    }

    @GetMapping("/today")
    public ResponseEntity<List<OrderEntity>> getTodayOrders(){
        return ResponseEntity.ok(this.orderService.getTodayOrders());
    }
    @GetMapping("/method/outside")
    public ResponseEntity<List<OrderEntity>> getOutsideOrders(){
        return ResponseEntity.ok(this.orderService.getOutsideOrders());
    }

    @GetMapping("/customer/{idCustomer}")
    public ResponseEntity<List<OrderEntity>> getCustomerOrders(@PathVariable String idCustomer){
        return ResponseEntity.ok(orderService.getCustomerOrders(idCustomer));
    }

    @GetMapping("/summary/{idOrder}")
    public ResponseEntity<OrderSummary> getSummary(@PathVariable int idOrder){
        return ResponseEntity.ok(this.orderService.getSummary(idOrder));
    }

    @PostMapping("/random")
    public ResponseEntity<Boolean> randomOrder(@RequestBody RandomOrderDto dto){
        return ResponseEntity.ok(this.orderService.saveRandomOrder(dto));
    }
}
