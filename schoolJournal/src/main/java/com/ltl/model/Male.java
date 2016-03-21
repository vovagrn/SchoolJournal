package com.ltl.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "M")
public class Male extends Person{
	
	private static final long serialVersionUID = 1384778502467053122L;	

}
