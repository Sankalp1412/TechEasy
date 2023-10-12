package com.techEasy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.techEasy.entity.Course;
import com.techEasy.entity.Lesson;
import com.techEasy.services.TrainerService;

@Controller
public class TrainerController {
	@Autowired
	TrainerService tService;
	@PostMapping("/addCourse")
	public String addCourse(@RequestParam("courseId")int courseId,
			@RequestParam("courseName")String courseName, 
			@RequestParam("coursePrice")int coursePrice)
	{
		Course course = new Course();
		course.setCourseId(courseId);
		course.setCourseName(courseName);
		course.setCoursePrice(coursePrice);
		tService.addCourse(course);
		return "redirect:/trainer_home";
	}
	
	@PostMapping("/addLesson")
	public String addLesson(@RequestParam("courseId")int courseId,@RequestParam("lessonId")int lessonId,
								@RequestParam("lessonName")String lessonName
								,@RequestParam("lessonTopics")String lessonTopics,@RequestParam("link")String link)
	{
		Course course = tService.getCourse(courseId);
		Lesson lesson = new Lesson(lessonId, lessonName, lessonTopics, link, course);
		tService.addLesson(lesson);
		course.getLessons().add(lesson);
		return "redirect:/trainer_home";
	}
	
	@GetMapping("/showCourses")
	public String showCourses(Model model) {
		List<Course> courseList = tService.courseList();
		model.addAttribute("courseList", courseList);
		return "courses";
	}
	
}
