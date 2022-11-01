package com.phelipecorrea.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.phelipecorrea.workshopmongo.domain.User;

@Repository
public interface UserReposotory extends MongoRepository<User, String>{
	

}
