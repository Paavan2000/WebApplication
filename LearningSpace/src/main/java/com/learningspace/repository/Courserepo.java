package com.learningspace.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningspace.entity.Course;

public interface Courserepo extends JpaRepository<Course, Integer> {

}
