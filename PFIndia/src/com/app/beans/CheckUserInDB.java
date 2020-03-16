package com.app.beans;

import org.springframework.stereotype.Component;

import com.app.dao.UserDao;

@Component
public class CheckUserInDB {

	private User user;
	private SignUp signUp;

	// 1234
	public static boolean userAvalablity(User sinUpuser) {
		boolean userAvailable;
		userAvailable = AddUserDao.getUserData(sinUpuser);

		if (userAvailable == false) {

			System.out.println("Your Record is not present in DB..  Please Sign up First..!!");
			AddUserDao.saveUser(sinUpuser);
			System.out.println("Data ADDED...SignUp Successful!!");
			return true;
		} else {
			AddUserDao.saveUser(sinUpuser);
			System.out.println("Login Successful!!");
		}

		return true;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public SignUp getSignUp() {
		return signUp;
	}

	public void setSignUp(SignUp signUp) {
		this.signUp = signUp;
	}

}
