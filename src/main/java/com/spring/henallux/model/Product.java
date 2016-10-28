package com.spring.henallux.model;

public class Product {
	private Integer numReference;
	private Double unitPrice;
	private Integer grade;
	private String brand;
	private String description;
	
	public Integer getNumReference() {
		return numReference;
	}
	
	public Double getUnitPrice() {
		return unitPrice;
	}
	
	public Integer getGrade() {
		return grade;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setNumReference(Integer numReference) {
		this.numReference = numReference;
	}
	
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
}
