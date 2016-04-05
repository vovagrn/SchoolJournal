package com.ltl.services;

import java.util.Collection;
import java.util.List;

import com.ltl.model.BaseModel;

public interface BaseServices <T extends BaseModel<?>>{
	
	//  * Deleting entity from database by id.
	public void deleteEntity(Long id) throws IllegalArgumentException;
	
	// * Deleting persistent entity from database.
	public void deleteEntity(T entity) throws IllegalArgumentException;
	
	// * Deleting all entities by their ids.
	public void deleteAllEntities(Collection<Long> ids) throws IllegalArgumentException;
	
	// * Getting entity by its unique identifier.
	public T getEntityById(Long id) throws IllegalArgumentException;
	
	// * Retrieves from database entities for IDs.
	public List<T> getEntitiesByIds(List<Long> ids) throws IllegalArgumentException;
	
	// * Getting all entities
	public List<T> getAllEntities();
	
	// * Save new object or update old one in the DB.
	public void save(T entity) throws IllegalArgumentException;

}
