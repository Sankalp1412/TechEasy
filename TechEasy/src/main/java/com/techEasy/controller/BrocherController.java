package com.techEasy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techEasy.entity.Brocher;
import com.techEasy.services.BrocherService;

@Controller
public class BrocherController {
	@Autowired
	BrocherService bService;

	@PostMapping("/brocherDL")
	public String brocherDL(@RequestParam("name")String name,
			@RequestParam("email")String email, @RequestParam("mobileNumber")String mobileNumber)
	{
		Brocher brocher = new Brocher();
		brocher.setName(name);
		brocher.setEmail(email);
		brocher.setMobileNumber(mobileNumber);
		bService.addBrocher(brocher);
		return "redirect:/brocherPDF";
	}
	
	@PostMapping("/syllabusDL")
	public String syllabusDL(@RequestParam("name")String name,
			@RequestParam("email")String email, @RequestParam("mobileNumber")String mobileNumber)
	{
		Brocher brocher = new Brocher();
		brocher.setName(name);
		brocher.setEmail(email);
		brocher.setMobileNumber(mobileNumber);
		bService.addBrocher(brocher);
		return "redirect:/syllabusPDF";
	}
}
