package com.ltl.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Entity
@Table(name = "phone")
public class Phone extends BaseModel<Integer>{
	
	@Column(name = "phone_number")
	private int phoneNumber;
	
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "person_id")
	private Person person;

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(19, 31).append(phoneNumber).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (this == other){
			return true;
		}
		if (other == null || getClass() != other.getClass()){
			return false;
		}
		Phone phone = (Phone) other;		
		return new EqualsBuilder().appendSuper(super.equals(other)).append(phoneNumber, phone.phoneNumber).isEquals();
	}	

}
