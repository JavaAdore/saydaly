package com.saydaly.common.entity.core;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.saydaly.common.entity.AbstractEntity;

@Entity
@Table(name="Country_Langauges")
@Cacheable
public class CountryLanguages extends AbstractEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="country_id" , referencedColumnName = "id")
	private Country country;
	
	@ManyToOne
	@JoinColumn(name="language_id" , referencedColumnName = "id")
	private Language language;
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}
	
	
	
}
