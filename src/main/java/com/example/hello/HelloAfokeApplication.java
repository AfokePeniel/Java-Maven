package com.example.hello;

// Import Spring Boot essentials
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Annotation to tell Spring this is the main entry point
@SpringBootApplication
public class HelloAfokeApplication {

    // The main method - starts the Spring Boot app
    public static void main(String[] args) {
        SpringApplication.run(HelloAfokeApplication.class, args);
    }
}

