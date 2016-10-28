package com.spring.henallux.model;

import java.util.GregorianCalendar;

public class Command {
	private GregorianCalendar commandDate;
	private Boolean paid;
	
	public GregorianCalendar getCommandDate() {
		return commandDate;
	}
	
	public Boolean getPaid() {
		return paid;
	}
	
	public void setCommandDate(GregorianCalendar commandDate) {
		this.commandDate = commandDate;
	}
	
	public void setPaid(Boolean paid) {
		this.paid = paid;
	}
	
	public Command() {
		// TODO Auto-generated constructor stub
	}
}
