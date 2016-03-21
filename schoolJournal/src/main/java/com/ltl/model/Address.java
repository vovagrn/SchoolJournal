package com.ltl.model;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Entity
@Table(name = "address")
public class Address extends BaseModel<Long>{
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "street")
	private String street;
	
	@Column(name = "house")
	private int house;
	
	@OneToMany(mappedBy = "address", fetch = FetchType.LAZY)
	private Set<Person> person = new LinkedHashSet<Person>();

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getHouse() {
		return house;
	}

	public void setHouse(int house) {
		this.house = house;
	}

	public Set<Person> getPerson() {
		return person;
	}

	public void setPerson(Set<Person> person) {
		this.person = person;
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder(19, 31).append(city).append(street).append(house).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (this == other){
			return true;
		}
		if (other == null || getClass() != other.getClass()){
			return false;
		}
		Address address = (Address) other;		
		return new EqualsBuilder().appendSuper(super.equals(other)).append(city, address.city).append(street,  address.street).append(house, address.house).isEquals();
	}	

}
