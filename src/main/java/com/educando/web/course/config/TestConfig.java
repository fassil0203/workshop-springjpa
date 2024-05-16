package com.educando.web.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educando.web.course.entities.Order;
import com.educando.web.course.entities.User;
import com.educando.web.course.entities.enums.OrderStatus;
import com.educando.web.course.repositories.OrderRepository;
import com.educando.web.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		User u3 = new User(null, "Aderaldo tobias", "aderaldotob@gmail.com", "988887896", "123456");
		User u4 = new User(null, "Bart Simpson", "bartsimpson@gmail.com", "977775555", "123456");
		User u5 = new User(null, "Lisa Simpsom", "lisasimpson@gmail.com", "977776666", "123456");
		User u6 = new User(null, "Meg Simpson", "megsimpson@gmail.com", "977777777", "123456");
		User u7 = new User(null, "Dog Simpson", "dogsimpson@gmail.com", "977778888", "123456");

		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

		userRepository.saveAllAndFlush(Arrays.asList(u1, u2, u3, u4, u5, u6, u7));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));

	}

}
