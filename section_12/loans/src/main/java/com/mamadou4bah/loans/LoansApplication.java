package com.mamadou4bah.loans;

import com.mamadou4bah.loans.dto.LoansContactInfoDto;
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
/*@ComponentScans({ @ComponentScan("com.mamadou4bah.loans.controller") })
@EnableJpaRepositories("com.mamadou4bah.loans.repository")
@EntityScan("com.mamadou4bah.loans.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {LoansContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice REST API Documentation",
				description = "Bmwas Loans microservice REST API Documentation",
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
				description = "Bmwas Loans microservice REST API Documentation",
				url = "https://www.Bmwas.com/swagger-ui.html"
		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}
}