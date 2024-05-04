package com.educando.web.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educando.web.course.entities.User;
import com.educando.web.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		User u3 = new User(null, "Aderaldo tobias", "aderaldotob@gmail.com", "988887896", "123456");
		User u4 = new User(null, "Bart Simpson", "bartsimpson@gmail.com", "977775555", "123456");
		
		userRepository.saveAllAndFlush(Arrays.asList(u1,u2,u3,u4));
		
	}
	
	
	
}
