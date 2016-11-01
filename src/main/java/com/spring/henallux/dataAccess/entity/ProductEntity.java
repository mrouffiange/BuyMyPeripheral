package com.spring.henallux.dataAccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="produit")
public class ProductEntity {
	@Id
	@Column(name="numReference")
	private Integer numReference;
	@Column(name="prixUnitaire")
	private Double unitPrice;
	@Column(name="notation")
	private Integer grade;
	@Column(name="marque")
	private String brand;
	@Column(name="description")
	private String description;
	@JoinColumn(name="codeCategorie", referencedColumnName="codeCategorie")
	@ManyToOne
	private CategoryEntity category;
	
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
	
	public CategoryEntity getCategory() {
		return category;
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
	
	public void setCategory(CategoryEntity category) {
		this.category = category;
	}
	
	public ProductEntity() {
		// TODO Auto-generated constructor stub
	}
}
