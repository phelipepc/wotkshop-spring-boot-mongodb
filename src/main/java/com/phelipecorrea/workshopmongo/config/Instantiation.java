package com.phelipecorrea.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.phelipecorrea.workshopmongo.domain.User;
import com.phelipecorrea.workshopmongo.repository.UserReposotory;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private UserReposotory userReposotory;

	@Override
	public void run(String... args) throws Exception {
		
		userReposotory.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		

		userReposotory.saveAll(Arrays.asList(maria, alex, bob));
		
	}

}