package com.eumpa.delivery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/cicd")
    public String home() {
        return "Hello CICD! version: ";
    }
}
