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
@Table(name = "photo")
public class Photo extends BaseModel<Integer>{
	
	@Column(name = "file_name")
    private String fileName;

    @ManyToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name = "person_id")
    private Person person;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other == null || other.getClass() != getClass()) {
            return false;
        }
        Photo photo = (Photo) other;
        return new EqualsBuilder().appendSuper(super.equals(other)).append(fileName, photo.fileName).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(19, 31).append(fileName).toHashCode();
    }
}

