package com.rish889.web.controller;

import reactor.core.publisher.Mono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rish889.modulea.EmpoleeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmpoleeService empoleeService;

    @GetMapping
    private Mono<String> getAllEmployees() {
        return Mono.just(empoleeService.getAllEmployees());
    }
}
