package com.techEasy.services;

import java.util.List;

import com.techEasy.entity.Course;
import com.techEasy.entity.Lesson;

public interface TrainerService {
	String addCourse(Course course);
	Course getCourse(int courseId);
	String addLesson(Lesson lesson);
	List<Course> courseList();
}
