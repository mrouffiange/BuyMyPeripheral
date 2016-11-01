package com.spring.henallux.dataAccess.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categorie")
public class CategoryEntity {
	@Id
	@Column(name="codeCategorie")
	private Integer codeCategory;
	@Column(name="groupeCategorie")
	private Integer categoryGroup;
	@OneToMany(mappedBy="product", fetch=FetchType.LAZY)
	private Collection<ProductEntity> products;
	
	public Integer getCodeCategory() {
		return codeCategory;
	}
	
	public Integer getCategoryGroup() {
		return categoryGroup;
	}
	
	public Collection<ProductEntity> getProducts() {
		return products;
	}
	
	public void setCodeCategory(Integer codeCategory) {
		this.codeCategory = codeCategory;
	}
	
	public void setCategoryGroup(Integer categoryGroup) {
		this.categoryGroup = categoryGroup;
	}
	
	public void setProducts(Collection<ProductEntity> products) {
		this.products = products;
	}
	
	public CategoryEntity() {
		// TODO Auto-generated constructor stub
	}
}
