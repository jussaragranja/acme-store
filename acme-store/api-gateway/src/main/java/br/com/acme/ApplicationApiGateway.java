package br.com.acme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class ApplicationApiGateway {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("card-service", r -> r.path("/api/v1/cards/{income}")
                        .uri("lb://ms-card-service"))
                .build();
    }

    public static void main(String[] args) {
        SpringApplication.run(ApplicationApiGateway.class, args);
    }
}
