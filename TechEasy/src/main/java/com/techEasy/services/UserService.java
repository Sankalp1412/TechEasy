 package com.techEasy.services;

import com.techEasy.entity.Users;

public interface UserService {
//	to add user
	String addUser(Users user);
//	to check whether email exists
	boolean checkEmail(String email);
//	validates user credentials
	boolean validPassword(String email, String password);
//	to check userRole
	boolean checkRole(String role);
}
