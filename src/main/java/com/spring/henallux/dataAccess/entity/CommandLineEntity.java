package com.spring.henallux.dataAccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="lignecommande")
public class CommandLineEntity {
	@Id
	@Column(name="numLigne")
	private Integer numLine;
	@Column(name="prixReel")
	private Double realPrice;
	@Column(name="quantite")
	private Integer quantity;
	@JoinColumn(name="numReference", referencedColumnName="numReference")
	@ManyToOne
	private ProductEntity product;
	@JoinColumn(name="numCommande", referencedColumnName="numCommande")
	@ManyToOne
	private CommandEntity command;
	
	public Integer getNumLine() {
		return numLine;
	}
	
	public Double getRealPrice() {
		return realPrice;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public CommandEntity getCommand() {
		return command;
	}
	
	public ProductEntity getProduct() {
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
	
	public void setCommand(CommandEntity command) {
		this.command = command;
	}
	
	public void setProduct(ProductEntity product) {
		this.product = product;
	}
	
	public CommandLineEntity() {
		// TODO Auto-generated constructor stub
	}
}