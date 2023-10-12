package com.techEasy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techEasy.entity.Brocher;
import com.techEasy.entity.Users;
import com.techEasy.services.UserService;

@Controller //this annotation is used to get in web pages and restcontroller is used to get json and all format
public class ServiceController {
	@Autowired
	UserService uService;
	
	@PostMapping("/addUser")
	public String addUser(@RequestParam("name")String name,@RequestParam("email")String email,
			@RequestParam("password")String password,@RequestParam("role")String role)
	{
		boolean EmailExists = uService.checkEmail(email);
		if(EmailExists==false)
		{
			Users user = new Users();
			user.setName(name);
			user.setEmail(email);
			user.setPassword(password);
			user.setRole(role);
			uService.addUser(user);
//			System.out.println("Email is registered successfully");
			return "redirect:/login";
		}
		else
		{
//			System.out.println("Email is already registered");
			return "redirect:/reRegister";
		}
	}
	
	@PostMapping("/validate")
	public String validate(@RequestParam("email")String email,
			@RequestParam("password")String password)
	{
		if(uService.checkEmail(email))
		{
		boolean val = uService.validPassword(email, password);
		if(val==true)
		{
//			System.out.println("Login successful");
			boolean userRole = uService.checkRole(email);
			if(userRole == true)
			{
				return "trainer_home";
			}
			else
			{
				return "student_home";
			}
		}
		else
		{
//			System.out.println("incorrect credentials");
			return "reLogin";
		}
	}
	else
	{
		return "reLogin";
	}
	}
	
	
}
