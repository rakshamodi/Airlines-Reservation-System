package com.mail.ARS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mail.ARS.model.Payment;

public interface payment_repo extends JpaRepository<Payment, Integer>{

}
