package com.spring.henallux.model;

public class CommandLine {
	private Integer numLine;
	private Double realPrice;
	private Integer quantity;
	private Product product;
	private Command command;
	
	public Integer getNumLine() {
		return numLine;
	}
	
	public Double getRealPrice() {
		return realPrice;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public Command getCommand() {
		return command;
	}
	
	public Product getProduct() {
		return product;
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
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public CommandLine() {
		// TODO Auto-generated constructor stub
	}
}
