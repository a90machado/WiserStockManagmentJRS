package io.altar.WiserStockManagmentAPI.Business;

// Imports:
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import io.altar.WiserStockManagmentAPI.DTOs.ShelfDTO;
import io.altar.WiserStockManagmentAPI.Models.Shelf;
import io.altar.WiserStockManagmentAPI.Repositories.ShelfRepository;

public class ShelfBusiness {

	// Initializing;
	private static final ShelfRepository SHELF_REPOSITORY = ShelfRepository.getInstance();

	// Get Shelf by ID
	public static ShelfDTO getShelfById(Long id) {
		Shelf searchShelf = SHELF_REPOSITORY.findByID(id);
		ShelfDTO newShelf = new ShelfDTO(searchShelf.getId(),searchShelf.getCapacity(),searchShelf.getProduct(),searchShelf.getPrice());
		return newShelf;
	}

	// Get all Shelfs
	public static Collection<ShelfDTO> getAllShelfs() {
		Iterator<Shelf> shelfs = SHELF_REPOSITORY.getAll().iterator();
		Collection<ShelfDTO> shelfsDTOs = new ArrayList<ShelfDTO>();
		while (shelfs.hasNext()) {
			Shelf shelf = shelfs.next();
			ShelfDTO newShelf = new ShelfDTO(shelf.getId(),shelf.getCapacity(),shelf.getProduct(),shelf.getPrice());
			shelfsDTOs.add(newShelf);
		}
		return shelfsDTOs;
	}

	// Save Shelf
	public static ShelfDTO saveShelf(Shelf saveShelf) {
		SHELF_REPOSITORY.save(saveShelf);
		ShelfDTO newShelf = new ShelfDTO(saveShelf.getId(),saveShelf.getCapacity(),saveShelf.getProduct(),saveShelf.getPrice());
		return newShelf;
	}
	
	// Update Shelf
	public static ShelfDTO replaceShelf(Shelf shelf) {
		SHELF_REPOSITORY.updateByID(shelf);
		ShelfDTO updatedShelf = new ShelfDTO(shelf.getId(),shelf.getCapacity(),shelf.getProduct(),shelf.getPrice());
		return updatedShelf;
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