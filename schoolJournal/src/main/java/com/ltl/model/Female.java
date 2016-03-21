package com.ltl.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "F")
public class Female extends Person{

	
	private static final long serialVersionUID = -1178663181804292011L;

}
