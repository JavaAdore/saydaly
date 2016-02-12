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
@Table(name="product_category")
@Cacheable
public class ProductCategory extends AbstractEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue
	@Column
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="product_id" , referencedColumnName="id")
	private Product product;
	
	@ManyToOne
	@JoinColumn(name="category_id" , referencedColumnName = "id")
	private Category category;
	
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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
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
