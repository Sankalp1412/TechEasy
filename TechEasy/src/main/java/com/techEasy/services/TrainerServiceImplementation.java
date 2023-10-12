package com.techEasy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.techEasy.entity.Course;
import com.techEasy.entity.Lesson;
import com.techEasy.repository.CourseRepository;
import com.techEasy.repository.LessonRepository;

@Service
public class TrainerServiceImplementation implements TrainerService {
	@Autowired
	CourseRepository courseRepo;
	@Autowired
	LessonRepository lessonRepo;

	@Override
	public String addCourse(Course course) {
		courseRepo.save(course);
		return "Course saved";
	}

	@Override
	public Course getCourse(int courseId) {
		return courseRepo.findById(courseId).get();
	}

	@Override
	public String addLesson(Lesson lesson) {
		lessonRepo.save(lesson);
		return "Lesson saved";
	}

	@Override
	public List<Course> courseList() {
		return courseRepo.findAll();
	}

}
