package com.ltl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Entity
@Table(name = "telephone")
public class Telephone extends BaseModel<Long>{
	
	@Column(name = "telephone_number")
	private int telephoneNumber;
	
	@ManyToOne()
	@JoinColumn(name = "person_id")
	private Person person;

	public int getPhoneNumber() {
		return telephoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.telephoneNumber = phoneNumber;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(19, 31).append(telephoneNumber).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (this == other){
			return true;
		}
		if (other == null || getClass() != other.getClass()){
			return false;
		}
		Telephone phone = (Telephone) other;		
		return new EqualsBuilder().appendSuper(super.equals(other)).append(telephoneNumber, phone.telephoneNumber).isEquals();
	}	

}
