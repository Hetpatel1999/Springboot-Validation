package com.validation.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.validation.springboot.model.User;

public interface UserRepository  extends JpaRepository<User, Long>{

	
}
