package com.examen.examenFinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class examenFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(examenFinalApplication.class, args);
		
	}
	
}