package io.altar.WiserStockManagmentAPI.Business;

// Imports:
import java.util.Collection;
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

	// Get all Shelfs
	public static Collection<Shelf> getAllShelfs() {
		return SHELF_REPOSITORY.getAll();
	}

	// Save Shelf
	public static Shelf saveShelf(Shelf editShelf) {
		return SHELF_REPOSITORY.save(editShelf);
	}
	
	// Update Shelf
	public static void replaceShelf(Shelf shelf) {
		SHELF_REPOSITORY.updateByID(shelf);
	}

	// Remove Shelf
	public static void removeShelf(long id) {
		SHELF_REPOSITORY.removeByID(id);
	}

	// Remove ALL
	public static void removeAll() {
		SHELF_REPOSITORY.removeAll();
	}

	// Check if Shelf Repository is empty
	public static boolean isEmpty() {
		return SHELF_REPOSITORY.isEmpty();
	}
}