package org.Polytech.covid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.Polytech.covid.config.UserAuthentificationProvider;
import org.Polytech.covid.config.LoginRequest;
import org.Polytech.covid.config.JwtAuthenticationResponse; 

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserAuthentificationProvider jwtTokenProvider;

    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest loginRequest) {
        // Validate username and password, and generate a JWT token
        String token = jwtTokenProvider.generateToken(loginRequest.getUsername());
        return ResponseEntity.ok(new JwtAuthenticationResponse(token));
    }
}
