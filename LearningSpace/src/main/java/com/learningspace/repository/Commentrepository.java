package com.learningspace.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningspace.entity.Comments;

public interface Commentrepository extends JpaRepository<Comments, Integer>{

}
