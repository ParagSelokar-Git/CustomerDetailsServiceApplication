package com.confonet.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.confonet.controller","com.confonet.service"})
@EntityScan("com.confonet.entity")
@EnableJpaRepositories("com.confonet.repository")
public class ConfonetCustomerDetailsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfonetCustomerDetailsServiceApplication.class, args);
	}

}
