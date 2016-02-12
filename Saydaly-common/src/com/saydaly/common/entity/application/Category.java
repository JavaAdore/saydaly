package com.saydaly.common.entity.application;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.saydaly.common.entity.AbstractEntity;
import com.saydaly.common.entity.core.Lookup;
import com.saydaly.common.entity.core.SystemUser;

@Entity
@Table
@Cacheable
public class Category extends AbstractEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue
	@Column
	private Long id;
	
	@Column(name="category_name_key" ,nullable=false ,length=25,unique=true)
	private String categoryName;
	
	@Column(name="category_description")
	private String categoryDescription;
	
	@Column(name="image_path_url")
	private String imagePathUrl;
	

	@ManyToOne()
	@JoinColumn(name="created_by" , referencedColumnName = "id")
	private SystemUser createdBy;

	@Column(name="creation_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;
	
	
	
	@ManyToOne()
	@JoinColumn(name="modified_by" , referencedColumnName = "id")
	private SystemUser lastlyModifiedBy;
	
	@Column(name="last_modification_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModificationDate;
	
	@ManyToOne
	@JoinColumn(name="status_id" , referencedColumnName = "id")
	@NotNull
	private Lookup status;
	
	
	

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

	public String getImagePathUrl() {
		return imagePathUrl;
	}

	public void setImagePathUrl(String imagePathUrl) {
		this.imagePathUrl = imagePathUrl;
	}

	public SystemUser getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(SystemUser createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public SystemUser getLastlyModifiedBy() {
		return lastlyModifiedBy;
	}

	public void setLastlyModifiedBy(SystemUser lastlyModifiedBy) {
		this.lastlyModifiedBy = lastlyModifiedBy;
	}

	public Date getLastModificationDate() {
		return lastModificationDate;
	}

	public void setLastModificationDate(Date lastModificationDate) {
		this.lastModificationDate = lastModificationDate;
	}

	public Lookup getStatus() {
		return status;
	}

	public void setStatus(Lookup status) {
		this.status = status;
	}

	
	
	

}
