package io.altar.WiserStockManagmentAPI.Business;

import java.awt.List;
import java.util.ArrayList;
// Imports:
import java.util.Collection;
import io.altar.WiserStockManagmentAPI.Models.Product;
import io.altar.WiserStockManagmentAPI.Models.Shelf;
import io.altar.WiserStockManagmentAPI.Repositories.ProductRepository;
import io.altar.WiserStockManagmentAPI.Repositories.ShelfRepository;

public class ProductBusiness {

	// Initializing;
	private static final ProductRepository PRODUCT_REPOSITORY = ProductRepository.getInstance();

	// Save Product
	public static Product saveProduct(Product saveProduct) {
		if (saveProduct.getListShelfs().isEmpty()) {
			return PRODUCT_REPOSITORY.save(saveProduct);
		} else if (ShelfBusiness.isEmpty()) {
			if (!saveProduct.getListShelfs().isEmpty()) {
				ArrayList<Long> newArray = new ArrayList<Long>();
				saveProduct.setListShelfs(newArray);
				return PRODUCT_REPOSITORY.save(saveProduct);
			} else {
				return PRODUCT_REPOSITORY.save(saveProduct);
			}
		}else if (!ShelfBusiness.isEmpty() && saveProduct.getListShelfs().size()>0){
			ArrayList<Long> listShelfs = saveProduct.getListShelfs();
			boolean checkShelfsInput = true;
			for (int i = 0; i < listShelfs.size() ; i++) {
				long element = listShelfs.get(i);
				if (ShelfBusiness.getShelfById(element)==null || ShelfBusiness.getShelfById(element).getId()==element){
					checkShelfsInput = false;
				}
			}
			if (checkShelfsInput==true){
				for (int i = 0; i < listShelfs.size() ; i++) {
					long element = listShelfs.get(i);
					ShelfBusiness.getShelfById(element).setProduct(saveProduct);
				}
				return PRODUCT_REPOSITORY.save(saveProduct);
			} else {
				
			}
			
		}
		return saveProduct;
	}

	// Replace Product
	public static void replaceProduct(Product product) {
		PRODUCT_REPOSITORY.updateByID(product);
	}

	// Get Product by ID
	public static Product getProductById(long id) {
		Product searchProduct = PRODUCT_REPOSITORY.findByID(id);
		return searchProduct;
	}

	// Get ALL Products
	public static Collection<Product> getAllProducts() {
		return PRODUCT_REPOSITORY.getAll();
	}

	// Remove Product by ID
	public static void removeProduct(long idToRemove) {
		PRODUCT_REPOSITORY.removeByID(idToRemove);
	}

	// Remove ALL Products
	public static void removeAllProducts() {
		PRODUCT_REPOSITORY.removeAll();
	}

	// Check Repository is Empty
	public static boolean isEmpty() {
		return PRODUCT_REPOSITORY.isEmpty();
	}

}