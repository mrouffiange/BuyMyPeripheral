package com.spring.henallux.model;

import java.util.GregorianCalendar;

public class User {
	private String login;
	private String password;
	private String firstname;
	private String lastname;
	private GregorianCalendar birthdate;
	private String streetAddress, localityAddress;
	private String email;
	private String phoneNumber;
	private String type;
	private Boolean male;
	private String faxNumber;
	
	public String getLogin() {
		return login;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public GregorianCalendar getBirthdate() {
		return birthdate;
	}
	
	public String getStreetAddress() {
		return streetAddress;
	}
	
	public String getLocalityAddress() {
		return localityAddress;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getType() {
		return type;
	}
	
	public Boolean getMale() {
		return male;
	}
	
	public String getFaxNumber() {
		return faxNumber;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public void setBirthdate(GregorianCalendar birthdate) {
		this.birthdate = birthdate;
	}
	
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	public void setLocalityAddress(String localityAddress) {
		this.localityAddress = localityAddress;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setMale(Boolean male) {
		this.male = male;
	}
	
	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
}
