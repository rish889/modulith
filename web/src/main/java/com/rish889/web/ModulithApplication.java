package com.rish889.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.rish889.*"})
public class ModulithApplication {
    public static void main(String[] args) {
        SpringApplication.run(ModulithApplication.class, args);
    }
}
