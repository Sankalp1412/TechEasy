package com.techEasy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.techEasy.entity.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Integer> {

}
