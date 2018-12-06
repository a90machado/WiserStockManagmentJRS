package io.altar.WiserStockManagmentAPI.Business;

import java.util.ArrayList;
import java.util.Collection;

import io.altar.WiserStockManagmentAPI.Models.Product;
import io.altar.WiserStockManagmentAPI.Repositories.ProductRepository;

public class ProductBusiness {
	
	// Initializing;
	private static final ProductRepository PRODUCT_REPOSITORY = ProductRepository.getInstance();
	
	// Save Product
	public static Product saveProduct(Product saveProduct){
		return PRODUCT_REPOSITORY.save(saveProduct);
	}
	
	
	// Get Product by ID
	public static Product getProductById (long id){
		Product searchProduct = PRODUCT_REPOSITORY.findByID(id);
		return searchProduct;
	}
	
	// Get All Products
	public static Collection<Product> getAllProducts(){
		return PRODUCT_REPOSITORY.getAll();
	}
	
	
	// Remove Product
	public static void removeProduct (long idToRemove){
		PRODUCT_REPOSITORY.removeByID(idToRemove);
	}
	
	public static void removeAllProducts(){
		PRODUCT_REPOSITORY.removeAll();
	}
	
	// Check Repository is Empty
	public static boolean isEmpty(){
		return PRODUCT_REPOSITORY.isEmpty();
	}

}