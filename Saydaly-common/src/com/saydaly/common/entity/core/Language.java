package com.saydaly.common.entity.core;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.saydaly.common.entity.AbstractEntity;
@Entity
@Cacheable
public class Language extends AbstractEntity implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue
	@Column
	private Long id;

	
	@Column(name = "language_abbreviation", nullable = false, length = 2, unique = true)
	private String languageAbbreviation;
	
	
	@Column(name = "language_name", nullable = false, length = 25, unique = true)
	private String languageName;

	
	@ManyToOne
	@JoinColumn(name="language_status" , referencedColumnName ="id")
	private Lookup languageStatus;
	
	@Column(name="language_image_url")
	private String language_image_url;

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getLanguageAbbreviation() {
		return languageAbbreviation;
	}


	public void setLanguageAbbreviation(String languageAbbreviation) {
		this.languageAbbreviation = languageAbbreviation;
	}


	public String getLanguageName() {
		return languageName;
	}


	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}


	public Lookup getLanguageStatus() {
		return languageStatus;
	}


	public void setLanguageStatus(Lookup languageStatus) {
		this.languageStatus = languageStatus;
	}


	public String getLanguage_image_url() {
		return language_image_url;
	}


	public void setLanguage_image_url(String language_image_url) {
		this.language_image_url = language_image_url;
	}


	

	
	
	

}
