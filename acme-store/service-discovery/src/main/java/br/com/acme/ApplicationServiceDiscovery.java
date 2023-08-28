package br.com.acme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ApplicationServiceDiscovery {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationServiceDiscovery.class, args);
    }
}
