package com.japy.pizzashop.service;

import com.japy.pizzashop.persitence.entity.CustomerEntity;
import com.japy.pizzashop.persitence.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerEntity findByPhone(String phone){
        return customerRepository.finfByPhone(phone);
    }

}
