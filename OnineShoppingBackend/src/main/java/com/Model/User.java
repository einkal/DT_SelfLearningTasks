package com.Model;

import java.io.Serializable;

import javax.persistence.Entity;
@Entity
	public class User implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String email;
	private String password;
	private String gender;
	private String phone;
	private String Country;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public User(String name, String email, String password, String gender, String phone, String country) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.phone = phone;
		Country = country;
	}
	public User()
	{
		
		
	}
	

}
