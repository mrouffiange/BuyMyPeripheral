package com.spring.henallux.model;

import java.util.Collection;
import java.util.GregorianCalendar;

public class Command {
	private Integer numCommand;
	private GregorianCalendar commandDate;
	private Boolean paid;
	private User user;
	private Collection<CommandLine> commandLines;
	
	public Integer getNumCommand() {
		return numCommand;
	}
	
	public GregorianCalendar getCommandDate() {
		return commandDate;
	}
	
	public Boolean getPaid() {
		return paid;
	}
	
	public Collection<CommandLine> getCommandLines() {
		return commandLines;
	}
	
	public User getUser() {
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
	
	public void setCommandLines(Collection<CommandLine> commandLines) {
		this.commandLines = commandLines;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public Command() {
		// TODO Auto-generated constructor stub
	}
}
