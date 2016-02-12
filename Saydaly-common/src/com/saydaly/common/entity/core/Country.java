package com.saydaly.common.entity.core;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.saydaly.common.entity.AbstractEntity;

@Entity
@Table
@Cacheable
public class Country extends AbstractEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue
	@Column
	private Long id;

	
	@Column(name = "country_abbreviation", nullable = false, length = 4, unique = true)
	private String countryAbbreviation;
	
	
	@Column(name = "country_name", nullable = false, length = 25, unique = true)
	private String countryName;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCountryAbbreviation() {
		return countryAbbreviation;
	}


	public void setCountryAbbreviation(String countryAbbreviation) {
		this.countryAbbreviation = countryAbbreviation;
	}


	public String getCountryName() {
		return countryName;
	}


	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	
	
	
	
	


}
