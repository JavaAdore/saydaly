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
@Table(name="product_type")
public class ProudctType extends AbstractEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="product_type_name_key")
	private String productTypeNameKey;
	
	@ManyToOne
	@JoinColumn(name = "product_unit_id" , referencedColumnName="id")
	private ProductUnit productUnit;
	
	
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

	public String getProductTypeNameKey() {
		return productTypeNameKey;
	}

	public void setProductTypeNameKey(String productTypeNameKey) {
		this.productTypeNameKey = productTypeNameKey;
	}

	public ProductUnit getProductUnit() {
		return productUnit;
	}

	public void setProductUnit(ProductUnit productUnit) {
		this.productUnit = productUnit;
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
