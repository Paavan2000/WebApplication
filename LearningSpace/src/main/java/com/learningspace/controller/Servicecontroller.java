package com.learningspace.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learningspace.entity.Comments;
import com.learningspace.entity.Course;
import com.learningspace.entity.Users;
import com.learningspace.service.Commentservice;
import com.learningspace.service.Trainerservice;
import com.learningspace.service.Userservice;

@Controller
public class Servicecontroller {
	@Autowired
	Userservice us;
	@Autowired
	Trainerservice tr;
	@Autowired
	Commentservice cs;

	@PostMapping("/addUser")
	public String addUser(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("password") String password, @RequestParam("role") String role) {
		boolean existmail = us.checkEmail(email);
		if (existmail == false) {
			Users u = new Users();
			u.setName(name);
			u.setEmail(email);
			u.setPassword(password);
			u.setRole(role);
			us.addUser(u);
			return "redirect:/login";
		} else {
			System.out.println("Emil already exist");
			return "redirect:/register";
		}

	}

	@PostMapping("/validation")
	public String validation(@RequestParam("email") String email, @RequestParam("password") String password) {
		if (us.checkEmail(email)) {
			boolean val = us.validation(email, password);
			if (val == true) {
				if(us.getUserRole(email).equals("Trainer")) {
					return "Trainer";
				}else {
				return "student";
				}
			} else {
				System.out.println("Invalid User");
				return "login";
			}
		} else {
			return "login";
		}

	}
	@PostMapping("/addComment")
	public String comments(@RequestParam("comment") String comment,Model model ) {
		Comments c=new Comments();
		c.setComment(comment);
		cs.addComment(c);
		List<Comments> com=cs.commentList();
		model.addAttribute("comments",com);
		return "redirect:/";
		
	}

}
