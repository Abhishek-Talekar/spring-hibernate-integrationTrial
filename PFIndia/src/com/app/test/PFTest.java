package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.beans.AppConfig;
import com.app.beans.SignUp;
import com.app.beans.User;

public class PFTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		User user = context.getBean("user", User.class);
		SignUp signUp = context.getBean("signUp",SignUp.class);
		signUp.signUp(user);
		
	}
}
