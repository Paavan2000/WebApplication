package com.learningspace.service;

import java.util.List;

import com.learningspace.entity.Comments;

public interface Commentservice {
	List <Comments> commentList();
	String addComment(Comments comment);
}
