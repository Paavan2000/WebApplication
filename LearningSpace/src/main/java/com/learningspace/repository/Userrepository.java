package com.learningspace.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningspace.entity.Course;
import com.learningspace.entity.Users;

public interface Userrepository extends JpaRepository<Users, Integer>  {
	boolean existsByEmail(String email);
	Users getByEmail(String email);
}
