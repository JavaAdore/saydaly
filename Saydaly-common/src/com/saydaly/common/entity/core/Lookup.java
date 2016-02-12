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
import javax.validation.constraints.NotNull;

import com.saydaly.common.entity.AbstractEntity;

@Entity
@Table
@Cacheable
public class Lookup extends AbstractEntity implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/************************** user status *******************************/
	public final static Lookup USER_STATUS_ACTIVE = new Lookup(1l);
	public final static Lookup USER_STATUS_LOCKED = new Lookup(2l);
	public final static Lookup USER_STATUS_SUSBENDED = new Lookup(3l);

	/*********************************************************************/
	
	@Id
	@GeneratedValue
	@Column
	private Long id;

	@Column(name = "lookup_name", nullable = false, length = 25, unique = true)
	private String lookupName;

	@Column(name = "look_description")
	private String lookupDescription;
	
	
	@ManyToOne
	@NotNull
	@JoinColumn(name = "category_id" , referencedColumnName = "id")
	private LookupCategory category;
	
	
	public Lookup() {
	}
	public Lookup(Long l) {
		this.id = l;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLookupName() {
		return lookupName;
	}

	public void setLookupName(String lookupName) {
		this.lookupName = lookupName;
	}

	public String getLookupDescription() {
		return lookupDescription;
	}

	public void setLookupDescription(String lookupDescription) {
		this.lookupDescription = lookupDescription;
	}

	public LookupCategory getCategory() {
		return category;
	}

	public void setCategory(LookupCategory category) {
		this.category = category;
	}

	public boolean isActive() {
		return this.equals(USER_STATUS_ACTIVE);
	}
	
	
	
	
}
