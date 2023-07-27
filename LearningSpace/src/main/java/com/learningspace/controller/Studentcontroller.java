package com.learningspace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learningspace.entity.Lesson;
import com.learningspace.service.Studentservice;

@Controller
public class Studentcontroller {
	@Autowired
	Studentservice ss;
	@PostMapping("/gotolesson")
	public String myLesson(@RequestParam("lid") int lid, Model model) {
		Lesson lesson=ss.getLesson(lid);
		model.addAttribute("lesson",lesson);
		return "mylesson";
	}
}
