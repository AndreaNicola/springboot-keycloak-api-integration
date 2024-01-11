package com.example.demo.controllers;

import jakarta.annotation.security.RolesAllowed;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("api/profiles1")
@RequiredArgsConstructor
public class Profile1Controller {


    @GetMapping
    @PreAuthorize("hasAnyAuthority('profiles1')")
    public List<String> getProfile(@RequestParam("id") String id) {
        return List.of("profile1", "profile2");
    }

}
