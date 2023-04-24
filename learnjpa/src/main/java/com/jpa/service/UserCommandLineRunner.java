package com.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.jpa.entity.User;
import com.sun.org.slf4j.internal.LoggerFactory;

public class UserCommandLineRunner implements CommandLineRunner {

	public static final com.sun.org.slf4j.internal.Logger log = LoggerFactory.getLogger(UserCommandLineRunner.class);
	
	@Autowired
	UserDAOService service;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Ritu","Admin");
		long newid = service.insert(user);
		log.debug("User created "+newid);
		
	}

	
}
