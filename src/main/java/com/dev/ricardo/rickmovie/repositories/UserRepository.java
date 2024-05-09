package com.dev.ricardo.rickmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.ricardo.rickmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
}
