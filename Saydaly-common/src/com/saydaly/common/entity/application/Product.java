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

import org.hibernate.annotations.Check;

import com.saydaly.common.entity.AbstractEntity;
import com.saydaly.common.entity.core.Lookup;
import com.saydaly.common.entity.core.SystemUser;

@Entity
@Table
@Cacheable
@Check(constraints="needProspection in (0,1)")
public class Product extends AbstractEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue
	@Column
	private Long id;
	
	@Column(name="product_name_key")
	private String productNameKey;
	
	@Column(name="product_description_key")
	private String productDiscriptionKey;
	
	@Column(name="need_prospection")
	private Integer needProspection = 0; 
	
	@Column(name="estimated_price")
	private Double estimatedPrice;
	
	
	@ManyToOne
	@JoinColumn(name="product_type_id" , referencedColumnName ="id")
	private ProudctType productType;

	
	@Column(name="image_path_url")
	private String imagePathUrl;
	
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


	public String getProductNameKey() {
		return productNameKey;
	}


	public void setProductNameKey(String productNameKey) {
		this.productNameKey = productNameKey;
	}


	public String getProductDiscriptionKey() {
		return productDiscriptionKey;
	}


	public void setProductDiscriptionKey(String productDiscriptionKey) {
		this.productDiscriptionKey = productDiscriptionKey;
	}


	public Integer getNeedProspection() {
		return needProspection;
	}


	public void setNeedProspection(Integer needProspection) {
		this.needProspection = needProspection;
	}


	public Double getEstimatedPrice() {
		return estimatedPrice;
	}


	public void setEstimatedPrice(Double estimatedPrice) {
		this.estimatedPrice = estimatedPrice;
	}


	public ProudctType getProductType() {
		return productType;
	}


	public void setProductType(ProudctType productType) {
		this.productType = productType;
	}


	public String getImagePathUrl() {
		return imagePathUrl;
	}


	public void setImagePathUrl(String imagePathUrl) {
		this.imagePathUrl = imagePathUrl;
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
