package com.lostline.webservices_nosql.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.lostline.webservices_nosql.domain.User;
import com.lostline.webservices_nosql.repository.UserRepository;
	
@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... arg0) throws Exception {

		userRepository.deleteAll();

		User ronaldo = new User(null, "Ronaldo Nazário", "r9@gmail.com");
		User zidane = new User(null, "Zinedine Zidane", "zidane@gmail.com");
		User denilson = new User(null, "Denílson de Oliveira", "denilsonshow@gmail.com");

		userRepository.saveAll(Arrays.asList(ronaldo, zidane, denilson));
	}
}
