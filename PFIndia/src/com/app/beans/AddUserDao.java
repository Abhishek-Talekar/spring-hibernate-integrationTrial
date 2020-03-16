package com.app.beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.app.entities.UserEntity;
import com.app.helper.SessionFactoryRegistry;

public class AddUserDao {
	static SessionFactory sessionFactory = null;
	static Session session = null;
	static Transaction transaction = null;
	
	public static boolean getUserData(User sinUpuser) {
		
		//sinUpuser = null;
		UserEntity dbUserData = new UserEntity();

		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			sinUpuser = new User();

			
			dbUserData = session.get(UserEntity.class, 2);
			System.out.println(dbUserData);

			if (dbUserData.getAadhar_no()==sinUpuser.getAadhar_no()) {
				System.out.println("You are already signed up... \n Please Login Directly!!");
				return true;
			}

		} finally {
			// SessionFactoryRegistry.close();
		}

		return false;
	}

	public static boolean saveUser(User user) {
		UserEntity newUser = null;
		boolean flag = false;

		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			newUser = new UserEntity();

			newUser.setName(user.getName());
			newUser.setAge(user.getAge());
			newUser.setAadhar_no(user.getAadhar_no());
			newUser.setCompany_name(user.getCompany_name());
			newUser.setEmail_id(user.getEmail_id());
			newUser.setGender(user.getGender());
			newUser.setMobile(user.getMobile());

			session.save(newUser);

			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
			SessionFactoryRegistry.close();
		}

		return true;
	}
}
