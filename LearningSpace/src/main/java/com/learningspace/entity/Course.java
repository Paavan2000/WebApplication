package com.learningspace.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Course {
	@Id
	int c_id;
	String c_name;
	int c_price;
	@OneToMany
	List<Lesson> lesson;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int c_id, String c_name, int c_price, List<Lesson> lesson) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_price = c_price;
		this.lesson = lesson;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public int getC_price() {
		return c_price;
	}
	public void setC_price(int c_price) {
		this.c_price = c_price;
	}
	public List<Lesson> getLesson() {
		return lesson;
	}
	public void setLesson(List<Lesson> lesson) {
		this.lesson = lesson;
	}
	@Override
	public String toString() {
		return "Course [c_id=" + c_id + ", c_name=" + c_name + ", c_price=" + c_price + ", lesson=" + lesson + "]";
	}
	
}
