package com.learningspace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningspace.controller.Studentcontroller;
import com.learningspace.entity.Lesson;
import com.learningspace.repository.LessonRepo;
@Service
public class Studentimp implements Studentservice {
	@Autowired
	LessonRepo lr;
	@Override
	public Lesson getLesson(int lid) {
		// TODO Auto-generated method stub
		return lr.findById(lid).get();
	}

}
