package com.phelipecorrea.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.phelipecorrea.workshopmongo.domain.Post;

@Repository
public interface PostReposotory extends MongoRepository<Post, String>{
	

}