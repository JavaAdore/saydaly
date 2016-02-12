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
@Cacheable
@Table(name="product_unit")
public class ProductUnit extends AbstractEntity implements Serializable
{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column
	private Long id;
	
	@Column(name="product_unit_name_key" ,nullable=false ,length=25,unique=true)
	private String productUnitName;
	
	@Column(name="product_unit_description")
	private String productUnitDescription;

	
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

	public String getProductUnitName() {
		return productUnitName;
	}

	public void setProductUnitName(String productUnitName) {
		this.productUnitName = productUnitName;
	}

	public String getProductUnitDescription() {
		return productUnitDescription;
	}

	public void setProductUnitDescription(String productUnitDescription) {
		this.productUnitDescription = productUnitDescription;
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
