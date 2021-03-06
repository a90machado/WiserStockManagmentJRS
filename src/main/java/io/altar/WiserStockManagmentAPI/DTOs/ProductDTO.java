package io.altar.WiserStockManagmentAPI.DTOs;

import io.altar.WiserStockManagmentAPI.Models.Entity;


public class ProductDTO extends Entity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Attributes
	private int discountPrice;
	private int iva;
	private double pvp;
	
	public ProductDTO(){}
	// Constructor
	public ProductDTO(long id, int discountPrice, int iva, double pvp) {
		this.setId(id); 
		this.discountPrice = discountPrice;
		this.iva = iva;
		this.pvp = pvp;
	}
	


	// Getters and Setters
	public int getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(int discountPrice) {
		this.discountPrice = discountPrice;
	}
	//-----------------------
	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}
	//-----------------------
	public double getPvp() {
		return pvp;
	}

	public void setPvp(double pvp) {
		this.pvp = pvp;
	}
	//-----------------------
}
