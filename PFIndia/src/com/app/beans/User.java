package com.app.beans;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
	@Value("Abhi")
	private String name;
	@Value("21")
	private int age;
	@Value("Male")
	private String gender;
	@Value("Amazon")
	private String company_name;
	@Value("959595")
	private long mobile;
	@Value("1212")
	private long aadhar_no;
	//@Value("talek@amazon.com")
	private String email_id;

	public String getEmail_id() {
		return email_id;
	}
	@Required
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public long getAadhar_no() {
		return aadhar_no;
	}

	public void setAadhar_no(long aadhar_no) {
		this.aadhar_no = aadhar_no;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", gender=" + gender + ", company_name=" + company_name
				+ ", mobile=" + mobile + ", aadhar_no=" + aadhar_no + "]";
	}

}
