package com.example.demo.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("api/authenticated")
public class AuthenticatedController {

    @GetMapping
    public List<String> getPets(@AuthenticationPrincipal Principal principal) {
        return List.of("auth0", "auth1", "auth2");
    }

}
