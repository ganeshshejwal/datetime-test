package com.cnx.test.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.cnx.test.dto.TransactionRequest;
import com.cnx.test.entity.Transaction;
import com.cnx.test.repository.TransactionRepository;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository repository;

    public Transaction save(TransactionRequest request) {
        Transaction txn = new Transaction();
        txn.setDateTime(request.getDateTime());
        return repository.save(txn);
    }
}
