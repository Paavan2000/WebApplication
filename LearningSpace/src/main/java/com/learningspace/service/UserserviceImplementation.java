package com.learningspace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningspace.entity.Users;
import com.learningspace.repository.Userrepository;

@Service
public class UserserviceImplementation implements Userservice {
	@Autowired
	Userrepository repo;

	@Override
	public String addUser(Users user) {
		repo.save(user);
		return "Added Successfully";
	}

	@Override
	public boolean checkEmail(String email) {
		return repo.existsByEmail(email);
	}

	@Override
	public boolean validation(String email, String password) {
		if (repo.existsByEmail(email)) {
			Users u = repo.getByEmail(email);
			String dbpassword = u.getPassword();
			if (password.equals(dbpassword)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@Override
	public String getUserRole(String email) {
		Users u=repo.getByEmail(email);
		return u.getRole();
	}

}
