package com.example.user_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public List<String> getUsers() {
        return List.of("Alice", "Bob", "Charlie");
    }
}
