package com.cnx.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cnx.test.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
