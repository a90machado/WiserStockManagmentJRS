package io.altar.WiserStockManagmentAPI.DTOs;

import io.altar.WiserStockManagmentAPI.Models.Entity;
import io.altar.WiserStockManagmentAPI.Models.Product;

public class ShelfDTO extends Entity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Attributes:
	private int capacity;
	private Product product;
	private double price;

	// Constructors:
	public ShelfDTO() {
	}

	public ShelfDTO(long id, int capacity, Product product, double price) {
		this.setId(id);
		this.capacity = capacity;
		this.product = product;
		this.price = price;
	}
	
	public ShelfDTO(long id, int capacity, double price) {
		this.setId(id);
		this.capacity = capacity;
		this.price = price;
	}

	// Getters and Setters
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	//------------------------
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	//------------------------
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	//------------------------
}
