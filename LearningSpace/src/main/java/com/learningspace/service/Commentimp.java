package com.learningspace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningspace.entity.Comments;
import com.learningspace.repository.Commentrepository;
@Service
public class Commentimp implements Commentservice {
	@Autowired
	Commentrepository cr;
	@Override
	public List<Comments> commentList() {
		return cr.findAll();
	}
	@Override
	public String addComment(Comments comment) {
		cr.save(comment);
		return "comment added!";
	}

}
