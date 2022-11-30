package com.phelipecorrea.workshopmongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.phelipecorrea.workshopmongo.domain.Post;
import com.phelipecorrea.workshopmongo.domain.User;
import com.phelipecorrea.workshopmongo.repository.PostReposotory;
import com.phelipecorrea.workshopmongo.repository.UserReposotory;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private UserReposotory userReposotory;
	
	@Autowired
	private PostReposotory postReposotory;

	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userReposotory.deleteAll();
		postReposotory.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		Post post1 = new Post(null, sdf.parse("21/03/2018"), "Partiu viagem", "Vou viajar para São Paulo. Abraços!", maria);
		Post post2 = new Post(null, sdf.parse("23/03/2018"), "Bom dia", "Acordei feliz hoje!", maria);
		
		userReposotory.saveAll(Arrays.asList(maria, alex, bob));
		postReposotory.saveAll(Arrays.asList(post1, post2));
		
	}

}
