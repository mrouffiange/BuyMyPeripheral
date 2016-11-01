package com.spring.henallux.dataAccess.entity;

import java.util.Collection;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="utilisateur")
public class UserEntity {
	@Id
	@Column(name="numCommande")
	private String login;
	@Column(name="motDePasse")
	private String password;
	@Column(name="nom")
	private String firstname;
	@Column(name="prenom")
	private String lastname;
	@Column(name="dateNaissance")
	private GregorianCalendar birthdate;
	@Column(name="rueAdr")
	private String streetAddress;
	@Column(name="localiteAdr")
	private String localityAddress;
	@Column(name="email")
	private String email;
	@Column(name="telephone")
	private String phoneNumber;
	@Column(name="typeUtilisateur")
	private String type;
	@Column(name="sexe")
	private Boolean male;
	@Column(name="fax")
	private String faxNumber;
	@OneToMany(mappedBy="user", fetch=FetchType.LAZY)
	private Collection<CommandEntity> commands;
	
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
	
	public Collection<CommandEntity> getCommands() {
		return commands;
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
	
	public void setCommands(Collection<CommandEntity> commands) {
		this.commands = commands;
	}
	
	public UserEntity() {
		// TODO Auto-generated constructor stub
	}
	
}