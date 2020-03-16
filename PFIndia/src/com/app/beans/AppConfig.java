package com.app.beans;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class AppConfig {
	@Autowired
	private Environment env;
	
	@Bean(autowire = Autowire.BY_NAME)
	public User user() {
		return new User();
	}
	
	@Bean(autowire = Autowire.BY_NAME)
	public SignUp signUp() {
		return new SignUp();
	}
	
	@Bean(autowire = Autowire.BY_NAME)
	public CheckUserInDB checkUserInDB() {
		return new CheckUserInDB();
	}
}
