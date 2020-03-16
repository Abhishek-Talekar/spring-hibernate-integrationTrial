package com.app.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sign_up_table")
public class UserEntity implements Serializable{
	@Id
	@Column(name = "pf_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int pf_id;

	@Column(name = "aadhar_no")
	protected long aadhar_no;

	protected String name;

	protected int age;

	protected String gender;

	@Column(name = "company_name")
	protected String company_name;

	protected long mobile;

	@Column(name = "email_id")
	protected String email_id;

	public int getPf_id() {
		return pf_id;
	}

	public void setPf_id(int pf_id) {
		this.pf_id = pf_id;
	}

	public long getAadhar_no() {
		return aadhar_no;
	}

	public void setAadhar_no(long aadhar_no) {
		this.aadhar_no = aadhar_no;
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

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	@Override
	public String toString() {
		return "UserEntity [pf_id=" + pf_id + ", aadhar_no=" + aadhar_no + ", name=" + name + ", age=" + age
				+ ", gender=" + gender + ", company_name=" + company_name + ", mobile=" + mobile + ", email_id="
				+ email_id + "]";
	}

}
