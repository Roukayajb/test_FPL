package org.sid;

import org.sid.entities.user;
import org.sid.service.UserRepository;
import org.sid.service.UserRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatApplication.class, args);
	}

	@Autowired
	  private  	UserRepository userrepository ;


	@Bean
    CommandLineRunner start(UserRestService userservice) {
		return args->{
			userrepository.save(new user("Roukaya", "Roukaya@gmail.com","1234"));

			userrepository.save(new user("Rihab", "Rihab@gmail.com","123"));
		};
		
	}
}

