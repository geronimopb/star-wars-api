package com.evaluation.swapi_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

// Este es el archivo principal de la aplicación Spring Boot
// que inicia la aplicación y configura el RestTemplate para realizar
// solicitudes HTTP a la API de SWAPI.
// Este archivo es esencial para que la aplicación funcione correctamente.

@SpringBootApplication
public class SwapiBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwapiBackendApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
