package com.learningspace.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.learningspace.entity.Course;
import com.learningspace.entity.Lesson;
import com.learningspace.service.Trainerservice;


@Controller
public class TrainerController {
	@Autowired
	Trainerservice ts;
	@PostMapping("/addCourse")
	public String addCourse(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("price") int price) {
		Course c=new Course();
		c.setC_id(id);
		c.setC_name(name);
		c.setC_price(price);
		ts.addCourse(c);
		return "redirect:/";
	}
	@PostMapping("/lesson")
	public String lesson(@RequestParam("cid") int cid,@RequestParam("lid") int lid,@RequestParam("lname") String lname,@RequestParam("ltopic") String ltopic,@RequestParam("vlink") String vlink) {
		Course course=ts.getCourse(cid);
		Lesson lesson=new Lesson(lid,lname,ltopic,vlink,course);
		ts.addlesson(lesson);
		course.getLesson().add(lesson);
		return "redirect:/";
		
	}
	@GetMapping("/showCourses")
	public String showCourses( Model model) {
		List<Course> courselist=ts.courseList();
		model.addAttribute("courselist",courselist);
		return "courses";
	}
}
