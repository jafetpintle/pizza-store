package com.japy.pizzashop.persitence.repository;

import com.japy.pizzashop.persitence.entity.PizzaEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.ListPagingAndSortingRepository;

public interface PizzaPagSortRepository extends ListPagingAndSortingRepository<PizzaEntity, Integer> {
    public Page<PizzaEntity> findByAvailableTrue(Pageable pageable);
}
