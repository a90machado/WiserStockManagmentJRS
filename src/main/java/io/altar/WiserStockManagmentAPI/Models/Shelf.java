package io.altar.WiserStockManagmentAPI.Models;

public class Shelf extends Entity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	
	public Shelf(Product product, int capacity, double price){
		this.product = product;
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