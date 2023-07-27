package com.learningspace.service;

import java.util.List;

import com.learningspace.entity.Course;
import com.learningspace.entity.Lesson;

public interface Trainerservice {
	public String addCourse(Course c);
	public String addlesson(Lesson lesson);
	public Course getCourse(int cid);
	public List<Course> courseList();
}
