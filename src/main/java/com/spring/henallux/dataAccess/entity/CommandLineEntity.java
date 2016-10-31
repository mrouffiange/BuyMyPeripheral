package com.spring.henallux.dataAccess.entity;

public class CommandLineEntity {
	private Integer numLine;
	private Double realPrice;
	private Integer quantity;
	
	public Integer getNumLine() {
		return numLine;
	}
	
	public Double getRealPrice() {
		return realPrice;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setNumLine(Integer numLine) {
		this.numLine = numLine;
	}
	
	public void setRealPrice(Double realPrice) {
		this.realPrice = realPrice;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public CommandLineEntity() {
		// TODO Auto-generated constructor stub
	}
}