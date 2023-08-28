package br.com.acme;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(title = "Fraud-Service",
                version = "1.0.0",
                description = "Esse projeto está sendo desenvolvido para a disciplina de arquitetura e design de software do MBA Full Stack Web Development - UNIESP",
                contact = @Contact(
                        name = "Jussara Souza",
                        url = "https://www.linkedin.com/in/jussaragranja"
                )
        )
)
public class ApplicationFraudService {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationFraudService.class, args);
    }
}
