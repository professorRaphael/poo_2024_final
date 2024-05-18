package com.aula2024.poo_2024_final;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.aula2024.poo_2024_final.repository")
public class Poo2024FinalApplication {

    public static void main(String[] args) {
        SpringApplication.run(Poo2024FinalApplication.class, args);
    }
}
