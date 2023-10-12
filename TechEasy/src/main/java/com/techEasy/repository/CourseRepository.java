package com.techEasy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.techEasy.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{

}
