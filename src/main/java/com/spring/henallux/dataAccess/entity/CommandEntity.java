package com.spring.henallux.dataAccess.entity;

import java.util.Collection;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="commande")
public class CommandEntity {
	@Id
	@Column(name="numCommande")
	private Integer numCommand;
	@Column(name="dateCommande")
	private GregorianCalendar commandDate;
	@Column(name="paye")
	private Boolean paid;
	@JoinColumn(name="login", referencedColumnName="login")
	@ManyToOne
	private UserEntity user;
	@OneToMany(mappedBy="command", fetch=FetchType.LAZY)
	private Collection<CommandLineEntity> commandLines;
	
	public Integer getNumCommand() {
		return numCommand;
	}
	
	public GregorianCalendar getCommandDate() {
		return commandDate;
	}
	
	public Boolean getPaid() {
		return paid;
	}
	
	public Collection<CommandLineEntity> getCommandLines() {
		return commandLines;
	}
	
	public UserEntity getUser() {
		return user;
	}
	
	public void setNumCommand(Integer numCommand) {
		this.numCommand = numCommand;
	}
	
	public void setCommandDate(GregorianCalendar commandDate) {
		this.commandDate = commandDate;
	}
	
	public void setPaid(Boolean paid) {
		this.paid = paid;
	}
	
	public void setCommandLines(Collection<CommandLineEntity> commandLines) {
		this.commandLines = commandLines;
	}
	
	public void setUser(UserEntity user) {
		this.user = user;
	}
	
	public CommandEntity() {
		// TODO Auto-generated constructor stub
	}
}