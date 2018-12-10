package io.altar.WiserStockManagmentAPI.Models;

import java.io.Serializable;

public class Entity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Attributes:
	private long id;

	// Get and Set ID:
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}