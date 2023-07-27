package com.learningspace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningspace.entity.Course;
import com.learningspace.entity.Lesson;
import com.learningspace.repository.LessonRepo;
import com.learningspace.repository.Courserepo;


@Service
public class Trainerimple implements Trainerservice {
	@Autowired
	Courserepo cr;
	@Autowired
	LessonRepo lr;
	public String addCourse(Course c) {
		cr.save(c);
		return "Course Added Successfully";
	}
	@Override
	public String addlesson(Lesson lesson) {
		lr.save(lesson);
		return "Lesson added Successfully";
	}
	@Override
	public Course getCourse(int cid) {
		return cr.findById(cid).get() ;
	}
	@Override
	public List<Course> courseList() {
		return cr.findAll();
	}
}
