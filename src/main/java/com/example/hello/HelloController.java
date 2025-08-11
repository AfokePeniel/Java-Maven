package com.example.hello;

// Import necessary Spring annotations
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Mark this class as a REST controller
@RestController
public class HelloController {

    // Handle GET requests to /hello
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Afoke! 🎉 Spring Boot is running.";
    }
}

