package com.spring.henallux.model;

import java.util.Collection;

public class Category {
	private Integer codeCategory;
	private Integer categoryGroup;
	private Collection<Product> products;
	
	public Integer getCodeCategory() {
		return codeCategory;
	}
	
	public Integer getCategoryGroup() {
		return categoryGroup;
	}
	
	public Collection<Product> getProducts() {
		return products;
	}
	
	public void setCodeCategory(Integer codeCategory) {
		this.codeCategory = codeCategory;
	}
	
	public void setCategoryGroup(Integer categoryGroup) {
		this.categoryGroup = categoryGroup;
	}
	
	public void setProducts(Collection<Product> products) {
		this.products = products;
	}
	
	public Category() {
		// TODO Auto-generated constructor stub
	}
}