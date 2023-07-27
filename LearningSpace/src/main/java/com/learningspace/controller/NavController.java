package com.learningspace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/createCourse")
	public String createCourse() {
		return "createcourse";
	}
	@GetMapping("/addLesson")
	public String addLesson() {
		return "addLesson";
	}
	@GetMapping("/courses")
	public String courses() {
		return "courses";
	}
	@GetMapping("/purchase")
	public String purchase() {
		return "purchase";
	}
	@GetMapping("/demolesson")
	public String demolesson() {
		return "demolesson";
	}
	@GetMapping("/mylesson")
	public String mylesson() {
		return "mylesson";
	}
	@GetMapping("/trainer")
	public String trainer() {
		return "trainer";
	}
	@GetMapping("/student")
	public String student() {
		return "student";
	}
}
