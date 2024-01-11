package com.example.demo.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("api/profiles2")
@RequiredArgsConstructor
public class Profile2Controller {


    @GetMapping
    @PreAuthorize("hasAnyAuthority('profiles2')")
    public List<String> getProfile(@RequestParam("id") String id) {
        return List.of("profile3", "profile4");
    }

}
