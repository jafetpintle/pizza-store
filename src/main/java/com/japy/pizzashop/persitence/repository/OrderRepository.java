package com.japy.pizzashop.persitence.repository;

import com.japy.pizzashop.persitence.entity.OrderEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface OrderRepository extends ListCrudRepository<OrderEntity, Integer> {
}
