package com.maik.springboot.carregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.maik.springboot.carregistration.repository")
@EntityScan("com.maik.springboot.carregistration.domain")
@SpringBootApplication
public class CarRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarRegistrationApplication.class, args);
	}

}
