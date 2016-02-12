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
@Table(name="lookup_category")
@Cacheable
public class LookupCategory extends AbstractEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public final static LookupCategory SYSTEM_USER_STATUS = new LookupCategory(
			1l);

	@Id
	@GeneratedValue
	@Column
	private Long id;

	@Column(name = "category_name", nullable = false, length = 25, unique = true)
	private String categoryName;

	@Column(name = "category_description")
	private String categoryDescription;

	public LookupCategory() {

	}

	public LookupCategory(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	
	

}
