package com.crudappliction.crudbackend;

import com.crudappliction.crudbackend.dao.UserDao;
import com.crudappliction.crudbackend.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class CrudbackendApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CrudbackendApplication.class, args);

		UserDao userDao = context.getBean(UserDao.class);

		userDao.save(new User("John Doe", "john_doe", "john.doe@example.com", "123-456-7890"));
		userDao.save(new User("Bob Johnson", "bob_johnson", "bob.johnson@example.com", "555-123-4567"));
		userDao.save(new User("Alice Brown", "alice_brown", "alice.brown@example.com", "777-888-9999"));
		userDao.save(new User("Charlie Wilson", "charlie_wilson", "charlie.wilson@example.com", "111-222-3333"));
	}

}