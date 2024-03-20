package com.rohit.dsa.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public/")
@RequiredArgsConstructor
public class PublicController {
    private final PublicService publicService;
    @PostMapping("/api/public/signup")
    public ResponseEntity<String> signUp(@RequestBody User user) {
        if (userService.existsByUsername(user.getUsername())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Username already exists");
        }
        user.setPassword(user.getHashPassword(user.getPassword())); // Hashing password
        userService.saveUser(user);
        return ResponseEntity.ok("User registered successfully");
    }
}
