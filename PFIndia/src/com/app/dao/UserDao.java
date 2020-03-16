package com.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.app.beans.User;
import com.app.entities.UserEntity;
import com.app.helper.SessionFactoryRegistry;

public class UserDao {
	
	public static boolean getUserData(User sinUpuser) {
		SessionFactory sessionFactory = null;
		Session session = null;
		User user = null;
		UserEntity signUpUser = new UserEntity();

		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			user = new User();
			
			signUpUser = session.get(UserEntity.class, signUpUser.getPf_id());
			System.out.println(signUpUser);

			if (sinUpuser.getAadhar_no() == user.getAadhar_no() && signUpUser!=null) {
				System.out.println("You are already signed up... \n Please Login Directly!!");
			}

		} finally {
			//SessionFactoryRegistry.close();
		}

		return false;
	}
}
