package com.mamadou4bah.cards;

import com.mamadou4bah.cards.dto.CardsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.mamadou4bah.cards.controller") })
@EnableJpaRepositories("com.mamadou4bah.cards.repository")
@EntityScan("com.mamadou4bah.cards.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {CardsContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Bmwas microservice REST API Documentation",
				description = "Bmwas Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Mamadou BAH",
						email = "tutor@bmwas.com",
						url = "https://www.bmwas.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.bmwas.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Bmwas Cards microservice REST API Documentation",
				url = "https://www.Bmwas.com/swagger-ui.html"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}
}