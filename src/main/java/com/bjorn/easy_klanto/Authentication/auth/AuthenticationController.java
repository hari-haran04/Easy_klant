package com.bjorn.easy_klanto.Authentication.auth;

import com.bjorn.easy_klanto.Authentication.config.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    @Autowired
    private JwtService jwtService;

    private final AuthenticateService service;

    private User user;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse>
    register(
            @RequestBody RegisterRequest request
    ){
        return ResponseEntity.ok(service.register(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody AuthenticateRequest request
    ){
        return ResponseEntity.ok(service.authenticate(request));

    }


    @GetMapping("/valid/{token}")
    public boolean isTokenValid1(@PathVariable String token){

        final String username = jwtService.extractUsername(token);
        return (username.equals(user.getUsername())) && !jwtService.isTokenExpired(token);

    }



}

