package io.altar.WiserStockManagmentAPI.Repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import io.altar.WiserStockManagmentAPI.Models.Entity;

//Abstract Class - Data Base CRUD
public abstract class EntityRepository <T extends Entity> {
	
	// Fields:
	private Map<Long, T>  baseDeDados = new HashMap<Long, T>();
	private long actualID = 0;
	
	// Get ID:
	public long getActualID() {
		return actualID;
	}
	
	// Prepare for next ID
	public long nextID(){
		return actualID++;
	}

	// Check if is empty:
	public boolean isEmpty(){
		if (baseDeDados.isEmpty())
		{return true;}else{
			return false;}
	}
	
	// Save:
	public T save(T entity){
		entity.setId(actualID);
		baseDeDados.put(entity.getId(), entity);
		nextID();
		return entity;
	}
	
	// Find by id:
	public T findByID(Long id){
		return baseDeDados.get(id);
	}
	
	// Get all:
	 public Collection<T> getAll(){
		return baseDeDados.values();
	}
	
	 // Edit by id:
	 public void updateByID (T entity){
		 baseDeDados.replace(entity.getId(), entity);
	 }
	 
	 // Remove:
	 public void removeByID (Long id){
		 baseDeDados.remove(id);
	 }
	 
	 // Remove:
	 public void removeAll(){
		 baseDeDados.clear();
	 }
}