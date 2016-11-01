package com.spring.henallux.dataAccess.entity;

import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="promotion")
public class DiscountEntity {
	@Id
	@Column(name="code")
	private Integer code;
	@Column(name="dateDebutValidite")
	private GregorianCalendar beginValidityDate;
	@Column(name="dateFinValidite")
	private GregorianCalendar endValidityDate;
	@Column(name="pourcentagePromotion")
	private Double discountInPourcent;
	@JoinColumn(name="codeCategorie", referencedColumnName="codeCategorie")
	@ManyToOne
	private CategoryEntity category;
	
	public Integer getCode() {
		return code;
	}
	
	public GregorianCalendar getBeginValidityDate() {
		return beginValidityDate;
	}
	
	public GregorianCalendar getEndValidityDate() {
		return endValidityDate;
	}
	
	public Double getDiscountInPourcent() {
		return discountInPourcent;
	}
	
	public CategoryEntity getCategory() {
		return category;
	}
	
	public void setCode(Integer code) {
		this.code = code;
	}
	
	public void setBeginValidityDate(GregorianCalendar beginValidityDate) {
		this.beginValidityDate = beginValidityDate;
	}
	
	public void setEndValidityDate(GregorianCalendar endValidityDate) {
		this.endValidityDate = endValidityDate;
	}
	
	public void setDiscountInPourcent(Double discountInPourcent) {
		this.discountInPourcent = discountInPourcent;
	}
	
	public void setCategory(CategoryEntity category) {
		this.category = category;
	}
	
	public DiscountEntity() {
		// TODO Auto-generated constructor stub
	}
}