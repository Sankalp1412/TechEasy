package com.techEasy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techEasy.entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{
	boolean existsByEmail(String email);
	Users getByEmail(String email);
}
