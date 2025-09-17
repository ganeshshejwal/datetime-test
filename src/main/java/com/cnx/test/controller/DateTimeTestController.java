package com.cnx.test.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class DateTimeTestController {

    @PostMapping("/save-date")
    public DateTimeDto saveDto() {
        
    }
    
}
