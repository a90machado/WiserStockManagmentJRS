package io.altar.WiserStockManagmentAPI.Models;

// Imports:
import java.util.ArrayList;

public class Product extends Entity {

	// Fields:
	private ArrayList<Long> listShelfs;
	private int discountPrice;
	private int iva;
	private double pvp;

	// Constructors:
	public Product(){}
	
	public Product(int discountPrice, int iva, double pvp) {
		this.listShelfs = new ArrayList<Long>();
		this.discountPrice = discountPrice;
		this.iva = iva;
		this.pvp = pvp;
	}
	
	public Product(ArrayList<Long> listShelfs, int discountPrice, int iva, double pvp) {
		this.listShelfs = listShelfs;
		this.discountPrice = discountPrice;
		this.iva = iva;
		this.pvp = pvp;
	}

	// Getters and Setters:
	public ArrayList<Long> getListShelfs() {
		return listShelfs;
	}

	public void setListShelfs(ArrayList<Long> listShelfs) {
		this.listShelfs = listShelfs;
	}
	//-------------------------------------------------------
	public double getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(int discountPrice) {
		this.discountPrice = discountPrice;
	}
	//-------------------------------------------------------
	public double getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}
	//-------------------------------------------------------
	public double getPvp() {
		return pvp;
	}

	public void setPvp(double pvp) {
		this.pvp = pvp;
	}
	//-------------------------------------------------------
	
	// Add new ID Shelf to ListShelfs:
	public void addToListShelfs(long e){
		this.listShelfs.add(e);
	}
	
	// Remove ID from ListShelfs:
	public void removeFromListShelfs(long idShelfRemove) {
		int index = this.listShelfs.indexOf(idShelfRemove);
		if (index!=-1) {
			this.listShelfs.remove(index);
		}
	}
	
	// Clear ListShelf
	public void clearListShelfs() {
		this.listShelfs.clear();
	}

}