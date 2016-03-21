package com.ltl.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "person")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "person_gender", discriminatorType = DiscriminatorType.STRING, length = 1)
public class Person extends BaseModel<Long> implements Serializable{
	
	private static final long serialVersionUID = -8775797199823495932L;

	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "middle_name")
	private String middleName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@ManyToOne()
	@JoinColumn(name = "address_id")
	private Address address;
	
	@OneToMany(mappedBy = "person", cascade = {CascadeType.ALL})
	private Set<Telephone> phones;
	
	@OneToMany(mappedBy = "person", cascade = {CascadeType.ALL})
	private Set<Photo> photos;

}
