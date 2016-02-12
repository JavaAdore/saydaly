package com.saydaly.common.entity.application;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.saydaly.common.entity.AbstractEntity;

@Entity
public class Pharmacy extends AbstractEntity implements Serializable {

	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="Pharmacy_name")
	private String pharmacyName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPharmacyName() {
		return pharmacyName;
	}

	public void setPharmacyName(String pharmacyName) {
		this.pharmacyName = pharmacyName;
	}

	
	
	
	
	
}
