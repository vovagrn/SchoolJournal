package com.ltl.dao;

import java.util.List;

import com.ltl.model.Person;

public interface PersonDao {
	
	public void addPerson(Person person);
	
	public Person findPersonById(int id);
	
	public List<Person> getAllPerson();
	
	public void editPerson(int id, String firstName, String middleName, String lastName);
	
	public void deletePerson(int id);

}
