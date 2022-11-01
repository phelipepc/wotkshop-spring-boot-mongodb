package com.phelipecorrea.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phelipecorrea.workshopmongo.domain.User;
import com.phelipecorrea.workshopmongo.repository.UserReposotory;

@Service
public class UserService {
	
	@Autowired
	private UserReposotory repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}

}
