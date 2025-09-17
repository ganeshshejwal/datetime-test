package com.cnx.test.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TransactionRequest {
    // Expecting format: "Sep 15, 2025 10:57:57.978"
    @JsonFormat(pattern = "MMM dd, yyyy HH:mm:ss.SSS")
    private LocalDateTime dateTime;
}

