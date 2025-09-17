package com.cnx.test.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnx.test.dto.DateTimeDto;
import com.cnx.test.service.DateTimeTestService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class DateTimeTestController {

   private final DateTimeTestService dateTimeService;

    @PostMapping("/save-date")
    public String saveDto(DateTimeDto dateTimeDto) {
        return dateTimeService.save(dateTimeDto);
    }
    
}
