package com.app.beans;

import org.springframework.stereotype.Component;

@Component
public class SignUp {

	private User user;
	private CheckUserInDB checkUserInDB;

	public void signUp(User sinUpuser) {

		boolean status = CheckUserInDB.userAvalablity(sinUpuser);

		if (status == true) {
			System.out.println("Added to DB");
			System.out.println("Sign up sucessful...");
		}
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public CheckUserInDB getCheckUserInDB() {
		return checkUserInDB;
	}

	public void setCheckUserInDB(CheckUserInDB checkUserInDB) {
		this.checkUserInDB = checkUserInDB;
	}

}
