package io.altar.WiserStockManagmentAPI.Services;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.altar.WiserStockManagmentAPI.Business.ProductBusiness;
import io.altar.WiserStockManagmentAPI.Models.Product;

@Path("/products")
public class ProductService {
	
	@DELETE
	@Path("/delete/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteProductByID(@PathParam("id") long id){
		ProductBusiness.removeProduct(id);
			//Response.status(400).build();
		return Response.ok().build();
	} 
	
	@DELETE
	@Path("/delete/all")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteAllProducts(){
		ProductBusiness.removeAllProducts();
		return Response.ok().build();
	}
	
	@GET
	@Path("/get/all")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Product> getAllProducts(){
		return ProductBusiness.getAllProducts();
	}
	
	@GET
	@Path("/get/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Product getProductByID(@PathParam("id") long id){
		return ProductBusiness.getProductById(id);
	}

	@POST
	@Path("/post/new")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Product addNewProduct(Product product){
		return ProductBusiness.saveProduct(product);
	}
	
	@POST
	@Path("/post/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Product updateProduct(Product product){
		ProductBusiness.replaceProduct(product);
		return product;
	}
}
