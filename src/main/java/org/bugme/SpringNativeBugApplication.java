package org.bugme;

import org.bugme.controller.UserController;
import org.common.domain.User;
import org.common.repository.UserRepository;
import org.common.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackageClasses = { UserController.class, UserService.class })
@EntityScan(basePackageClasses = { User.class })
@EnableJpaRepositories(basePackageClasses = { UserRepository.class })
public class SpringNativeBugApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringNativeBugApplication.class, args);
	}

}
