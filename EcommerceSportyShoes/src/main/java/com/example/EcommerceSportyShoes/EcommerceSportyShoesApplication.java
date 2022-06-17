package com.example.EcommerceSportyShoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.EcommerceSportyShoes.repository")
@EntityScan("com.example.EcommerceSportyShoes.model")
@ComponentScan("com.example.EcommerceSportyShoes.service")
@ComponentScan("com.example.EcommerceSportyShoes.controller")
@ComponentScan("com.example.EcommerceSportyShoes.websecurity.config.sample")
public class EcommerceSportyShoesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceSportyShoesApplication.class, args);
	}

}
