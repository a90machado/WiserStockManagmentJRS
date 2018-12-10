package io.altar.WiserStockManagmentAPI.Business;

import java.awt.List;
import java.util.ArrayList;
// Imports:
import java.util.Collection;
import java.util.Iterator;

import io.altar.WiserStockManagmentAPI.DTOs.ProductDTO;
import io.altar.WiserStockManagmentAPI.Models.Product;
import io.altar.WiserStockManagmentAPI.Models.Shelf;
import io.altar.WiserStockManagmentAPI.Repositories.ProductRepository;
import io.altar.WiserStockManagmentAPI.Repositories.ShelfRepository;

public class ProductBusiness {

	// Initializing;
	private static final ProductRepository PRODUCT_REPOSITORY = ProductRepository.getInstance();

	// Save Product
	public static ProductDTO saveProduct(Product saveProduct) {
		PRODUCT_REPOSITORY.save(saveProduct);
		ProductDTO newProduct = new ProductDTO(saveProduct.getId(),saveProduct.getDiscountPrice(),saveProduct.getIva(),saveProduct.getPvp());
		return newProduct;
	}

	// Replace Product
	public static ProductDTO replaceProduct(Product product) {
		PRODUCT_REPOSITORY.updateByID(product);
		ProductDTO updatedProduct = new ProductDTO(product.getId(),product.getDiscountPrice(),product.getIva(),product.getPvp());
		return updatedProduct;
	}

	// Get Product by ID
	public static ProductDTO getProductById(long id) {
		Product searchProduct = PRODUCT_REPOSITORY.findByID(id);
		ProductDTO productDTO = new ProductDTO(searchProduct.getId(),searchProduct.getDiscountPrice(),searchProduct.getIva(),searchProduct.getPvp());
		return productDTO;
	}

	// Get ALL Products
	public static Collection<ProductDTO> getAllProducts() {
		Iterator<Product> products = PRODUCT_REPOSITORY.getAll().iterator();
		Collection<ProductDTO> productDTOs = new ArrayList<ProductDTO>();
		while(products.hasNext()){
			Product product = products.next();
			ProductDTO productDTO = new ProductDTO(product.getId(),product.getDiscountPrice(),product.getIva(),product.getPvp());
			productDTOs.add(productDTO);
			}
		return productDTOs;
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