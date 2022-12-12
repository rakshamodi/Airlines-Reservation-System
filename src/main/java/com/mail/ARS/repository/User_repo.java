package com.mail.ARS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mail.ARS.model.User;

public interface User_repo extends JpaRepository<User, Integer>{

	public boolean existsByEmail(String email);

	public User findByEmail(String email);
}
