package com.ppfurtado.userapi;

import com.ppfurtado.userapi.domain.User;
import com.ppfurtado.userapi.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class UserApiApplication implements CommandLineRunner {

	private final UserRepository userRepository;

	public UserApiApplication(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(UserApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.saveAll(List.of(
				new User(null, "Pedro", "furtado.pedropaulo@gmail.com", "123456", "100"),
				new User(null, "Kelly", "kelly2Vilella@gmail.com", "123456", "120")
				)
		);
	}
}
