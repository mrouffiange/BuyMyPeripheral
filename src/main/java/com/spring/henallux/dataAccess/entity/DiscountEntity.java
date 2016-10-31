package com.spring.henallux.dataAccess.entity;

import java.util.GregorianCalendar;

public class DiscountEntity {
	private Integer code;
	private GregorianCalendar beginValidityDate;
	private GregorianCalendar endValidityDate;
	private Double discountInPourcent;
	
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
	
	public DiscountEntity() {
		// TODO Auto-generated constructor stub
	}
}