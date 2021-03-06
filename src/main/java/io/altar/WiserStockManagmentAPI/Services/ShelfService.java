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
import io.altar.WiserStockManagmentAPI.Business.ShelfBusiness;
import io.altar.WiserStockManagmentAPI.DTOs.ShelfDTO;
import io.altar.WiserStockManagmentAPI.Models.Shelf;

@Path("/shelfs")
public class ShelfService {
	
	@DELETE
	@Path("/delete/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteProductByID(@PathParam("id") long id){
		ShelfBusiness.removeShelf(id);
			//Response.status(400).build();
		return Response.ok().build();
	} 
	
	@DELETE
	@Path("/delete/all")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteAllProducts(){
		ShelfBusiness.removeAll();
		return Response.ok().build();
	}
	
	@GET
	@Path("/get/all")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<ShelfDTO> getAllShelfs(){
		return ShelfBusiness.getAllShelfs();
	}
	
	@GET
	@Path("/get/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public ShelfDTO getProductByID(@PathParam("id") long id){
		return ShelfBusiness.getShelfById(id);
	}
	
	
	@POST
	@Path("/post/new")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ShelfDTO addNewProduct(Shelf shelf){
		return ShelfBusiness.saveShelf(shelf);
	}
	
	@POST
	@Path("/post/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Shelf updateShelf(Shelf shelf) {
		ShelfBusiness.replaceShelf(shelf);
		return shelf;
	}
	
	

}
