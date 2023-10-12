package com.techEasy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //this annotation is used to get in web pages and restcontroller is used to get json and all format
public class NavController {
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	
	@GetMapping("/register")
	public String register()
	{
		return "register";
	}
	
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@GetMapping("/student_home")
	public String student_home()
	{
		return "student_home";
	}
	
	@GetMapping("/trainer_home")
	public String trainer_home()
	{
		return "trainer_home";
	}
	
	@GetMapping("/reRegister")
	public String reRegister()
	{
		return "reRegister";
	}
	
	@GetMapping("/reLogin")
	public String reLogin()
	{
		return "reLogin";
	}
	
	@GetMapping("/createCourse")
	public String createCourse()
	{
		return "createCourse";
	}
	
	@GetMapping("/addLesson")
	public String addLesson()
	{
		return "addLesson";
	}
	
	@GetMapping("/courses")
	public String courses()
	{
		return "courses";
	}
	
	@GetMapping("/brocher")
	public String brocher()
	{
		return "brocher";
	}
	
	@GetMapping("/syllabus")
	public String syllabus()
	{
		return "syllabus";
	}
	
	@GetMapping("/brocherPDF")
	public String brocherPDF()
	{
		return "brocherPDF";
	}
	
	@GetMapping("/syllabusPDF")
	public String syllabusPDF()
	{
		return "syllabusPDF";
	}
	
	@GetMapping("/purchase")
	public String purchase()
	{
		return "purchase";
	}
	
	@GetMapping("/myCourses")
	public String myCourses()
	{
		return "myCourses";
	}
}
