package org.example.resource.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class SimpleController {

    @GetMapping("/simple")
    public String simpleResponse() {
        return "Simple response: " + LocalDateTime.now();
    }
}
