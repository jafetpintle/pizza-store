package com.japy.pizzashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EnableJpaAuditing
public class PizzaShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzaShopApplication.class, args);
	}

}
