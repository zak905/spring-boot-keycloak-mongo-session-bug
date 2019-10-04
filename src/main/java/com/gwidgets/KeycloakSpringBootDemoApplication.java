package com.gwidgets;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KeycloakSpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeycloakSpringBootDemoApplication.class, args);
	}


	@Bean
	public KeycloakSpringBootConfigResolver keycloaktConfigResolver() {
		return new KeycloakSpringBootConfigResolver();
	}
}
