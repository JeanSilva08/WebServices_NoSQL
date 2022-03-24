package com.lostline.webservices_nosql.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.lostline.webservices_nosql.domain.Post;
import com.lostline.webservices_nosql.domain.User;
import com.lostline.webservices_nosql.repository.PostRepository;
import com.lostline.webservices_nosql.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;

	@Override
	public void run(String... arg0) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

		userRepository.deleteAll();
		postRepository.deleteAll();

		User ronaldo = new User(null, "Ronaldo Nazário", "r9@gmail.com");
		User zidane = new User(null, "Zinedine Zidane", "zidane@gmail.com");
		User denilson = new User(null, "Denílson de Oliveira", "denilsonshow@gmail.com");

		Post post1 = new Post(null, sdf.parse("23/04/2021"), "Partiu viagem!", "Vou viajar para NY! tmj!!!!", ronaldo);
		Post post2 = new Post(null, sdf.parse("29/05/2022"), "Bom dia!", "Coé rapazeadinha, que dia lindo heim!", ronaldo);

		userRepository.saveAll(Arrays.asList(ronaldo, zidane, denilson));
		postRepository.saveAll(Arrays.asList(post1, post2));
	}
}
