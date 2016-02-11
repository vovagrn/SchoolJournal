package com.ltl.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person extends BaseModel<Integer>{
	
	private String firstName;
	
	private String middleName;
	
	private String lastName;
	
	private Address address;
	
	private Set<Phone> phone;
	
	private Set<Photo> photo;

}
