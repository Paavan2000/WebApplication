package com.learningspace.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningspace.entity.Lesson;

public interface LessonRepo extends JpaRepository<Lesson, Integer> {

}
