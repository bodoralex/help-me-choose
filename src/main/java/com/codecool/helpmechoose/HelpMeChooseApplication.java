package com.codecool.helpmechoose;

import com.codecool.helpmechoose.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@SpringBootApplication
@EnableJpaRepositories("com.codecool.helpmechoose.repository")
@EntityScan("com.codecool.helpmechoose.model")
public class HelpMeChooseApplication {

//	@Autowired
//	DataSource dataSource;

	@Autowired
    UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(HelpMeChooseApplication.class, args);
	}
}
