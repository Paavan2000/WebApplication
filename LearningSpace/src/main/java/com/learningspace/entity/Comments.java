package com.learningspace.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Comments {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int commentid;
	String comment;
	public Comments() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Comments(int commentid, String comment) {
		super();
		this.commentid = commentid;
		this.comment = comment;
	}
	public int getCommentid() {
		return commentid;
	}
	public void setCommentid(int commentid) {
		this.commentid = commentid;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "Comment [commentid=" + commentid + ", comment=" + comment + "]";
	}
	
}
