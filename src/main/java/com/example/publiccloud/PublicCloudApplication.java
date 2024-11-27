package com.example.publiccloud;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PublicCloudApplication {

    public static void main(String[] args) {
        // Load .env variables
        Dotenv dotenv = Dotenv.load();
        System.setProperty("SPRING_DATASOURCE_URL", dotenv.get("SPRING_DATASOURCE_URL"));
        System.setProperty("SPRING_DATASOURCE_USERNAME", dotenv.get("SPRING_DATASOURCE_USERNAME"));
        System.setProperty("SPRING_DATASOURCE_PASSWORD", dotenv.get("SPRING_DATASOURCE_PASSWORD"));
        System.setProperty("SPRING_DATASOURCE_DRIVER_CLASS_NAME", dotenv.get("SPRING_DATASOURCE_DRIVER_CLASS_NAME"));
        System.setProperty("SPRING_JPA_HIBERNATE_DDL_AUTO", dotenv.get("SPRING_JPA_HIBERNATE_DDL_AUTO"));
        System.setProperty("SPRING_JPA_SHOW_SQL", dotenv.get("SPRING_JPA_SHOW_SQL"));
        System.setProperty("SPRING_JPA_PROPERTIES_HIBERNATE_FORMAT_SQL", dotenv.get("SPRING_JPA_PROPERTIES_HIBERNATE_FORMAT_SQL"));
        System.setProperty("SPRING_JPA_PROPERTIES_HIBERNATE_DIALECT", dotenv.get("SPRING_JPA_PROPERTIES_HIBERNATE_DIALECT"));

        SpringApplication.run(PublicCloudApplication.class, args);
    }
}
