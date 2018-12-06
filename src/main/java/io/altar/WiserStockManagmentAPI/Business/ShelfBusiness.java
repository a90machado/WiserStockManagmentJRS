package io.altar.WiserStockManagmentAPI.Business;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import io.altar.WiserStockManagmentAPI.Models.Product;
import io.altar.WiserStockManagmentAPI.Models.Shelf;
import io.altar.WiserStockManagmentAPI.Repositories.ShelfRepository;

public class ShelfBusiness {

	// Initializing;
	private static final ShelfRepository SHELF_REPOSITORY = ShelfRepository.getInstance();
	
	
	// Get Shelf by ID
	public static Shelf getShelfById(Long id) {
		Shelf searchShelf = SHELF_REPOSITORY.findByID(id);
		return searchShelf;
	}
	
	// Edit Shelf
	public static Shelf saveShelf (Shelf editShelf) {
		return SHELF_REPOSITORY.save(editShelf);
	}
	
	// Check if Shelf Repository is empty
	public static boolean isEmpty() {
		return SHELF_REPOSITORY.isEmpty();
	}
	
	// Get all Shelfs
	public static Collection<Shelf> getAllShelfs(){
		return SHELF_REPOSITORY.getAll();
	}
	
	// Remove Shelf
	public static void removeShelf(long id) {
		SHELF_REPOSITORY.removeByID(id);
	}
	
	public static void removeAll(){
		SHELF_REPOSITORY.removeAll();
	}

}