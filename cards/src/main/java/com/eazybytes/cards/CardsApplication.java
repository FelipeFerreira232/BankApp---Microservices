package com.eazybytes.cards;

import com.eazybytes.cards.dto.CardsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API Documentation",
				description = "BankApp Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Felipe Albuquerque",
						email = "kikoalbuquerque02@gmail.com",
						url = "https://www.felipealbuquerque.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.felipealbuquerque.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "BankApp Cards microservice REST API Documentation",
				url = "https://www.felipealbuquerque.com/swagger-ui.html"
		)
)
@EnableDiscoveryClient
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(CardsContactInfoDto.class)
@SpringBootApplication
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}

}
