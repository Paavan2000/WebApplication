package com.learningspace.service;

import com.learningspace.entity.Users;

public interface Userservice {
	String addUser(Users user);
	boolean checkEmail(String email);
	boolean validation(String email,String password);
	String getUserRole(String email);
}
