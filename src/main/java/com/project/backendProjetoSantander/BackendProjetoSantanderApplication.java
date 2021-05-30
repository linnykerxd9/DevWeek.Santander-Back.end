package com.project.backendProjetoSantander;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackendProjetoSantanderApplication {

	public static void main(String[] args) {

		SpringApplication.run(BackendProjetoSantanderApplication.class, args);
	}

	@Bean
	public OpenAPI customOpenIPA(@Value("${application.description}") String description){
		return new OpenAPI().info(new Info()
				.title(description)
				.version("1.0")
				.termsOfService("http://swagger.io/terms")
				.license(new License().name("apache 2.0").url("http://springdoc.org")));
	}

}
