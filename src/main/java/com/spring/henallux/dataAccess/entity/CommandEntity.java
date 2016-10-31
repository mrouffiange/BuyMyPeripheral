package com.spring.henallux.dataAccess.entity;

import java.util.GregorianCalendar;

public class CommandEntity {
	private Integer numCommand;
	private GregorianCalendar commandDate;
	private Boolean paid;
	
	public Integer getNumCommand() {
		return numCommand;
	}
	
	public GregorianCalendar getCommandDate() {
		return commandDate;
	}
	
	public Boolean getPaid() {
		return paid;
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
	
	public CommandEntity() {
		// TODO Auto-generated constructor stub
	}
}