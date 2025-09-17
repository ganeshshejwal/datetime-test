package com.cnx.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cnx.test.dto.TransactionRequest;
import com.cnx.test.entity.Transaction;
import com.cnx.test.service.TransactionService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/transactions")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService service;

    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody TransactionRequest request) {
        return ResponseEntity.ok(service.save(request));
    }
}