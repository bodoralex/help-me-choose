package com.codecool.helpmechoose;

import com.codecool.helpmechoose.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelpMeChooseApplication {

	@Autowired
    UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(HelpMeChooseApplication.class, args);
	}
}
