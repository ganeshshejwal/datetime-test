package com.cnx.test.service;

import org.springframework.stereotype.Service;

import com.cnx.test.dto.DateTimeDto;

@Service
public class DateTimeTestService {

    public String save(DateTimeDto dateTimeDto) {
        return "Date Time Saved Successfully";
    }

}
