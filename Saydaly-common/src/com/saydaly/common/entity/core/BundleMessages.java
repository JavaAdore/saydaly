package com.saydaly.common.entity.core;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.saydaly.common.entity.AbstractEntity;

@Entity
@Table(name = "bundle_messages")
public class BundleMessages extends AbstractEntity implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="bundle_message_key")
	private String bundleMessageKey;
	
	@Column(name="bundle_message_value")
	private String bundleMessageValue;
	
	@ManyToOne
	@JoinColumn(name="language_id" , referencedColumnName ="id")
	private Language langauge;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBundleMessageKey() {
		return bundleMessageKey;
	}

	public void setBundleMessageKey(String bundleMessageKey) {
		this.bundleMessageKey = bundleMessageKey;
	}

	public String getBundleMessageValue() {
		return bundleMessageValue;
	}

	public void setBundleMessageValue(String bundleMessageValue) {
		this.bundleMessageValue = bundleMessageValue;
	}

	public Language getLangauge() {
		return langauge;
	}

	public void setLangauge(Language langauge) {
		this.langauge = langauge;
	}
	
	
	

	
	
}
