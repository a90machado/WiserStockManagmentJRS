package io.altar.WiserStockManagmentAPI.Models;

import io.altar.WiserStockManagmentAPI.Business.ProductBusiness;

public class Shelf extends Entity {
	
	// Attributes:
	private int capacity;
	private Product product;
	private double price;
	
	// Constructors:
	public Shelf(){}
	
	public Shelf(int capacity, double price) {
		this.capacity = capacity;
		this.price = price;
	}
	
	public Shelf(long idProduct, int capacity, double price){
		this.product = ProductBusiness.getProductById(idProduct);
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
	//-------------------------------------------------------
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product){
		this.product = product;
	}

	public void setProductAndSetShelf(Product product) {
		this.product = product;
		this.product.addToListShelfs(this.getId());
	}
	//-------------------------------------------------------
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	//-------------------------------------------------------
	
}