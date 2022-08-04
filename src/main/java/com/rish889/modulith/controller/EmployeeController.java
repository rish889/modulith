package com.rish889.modulith.controller;

import reactor.core.publisher.Mono;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @GetMapping
    private Mono<String> getAllEmployees() {
        return Mono.just("Rishabh Garcha");
    }
}
