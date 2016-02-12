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

@Entity
@Table(name="Purchace_Order_Image")
@Cacheable
public class PurchaceOrderImage extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column
	private Long id;

	
	@ManyToOne
	@JoinColumn(name="purchase_Order_id" , referencedColumnName="id")
	private PurchaceOrder purchaseOrder;
	
	@Column(name="image_path_url")
	private String imagePathUrl;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PurchaceOrder getPurchaseOrder() {
		return purchaseOrder;
	}

	public void setPurchaseOrder(PurchaceOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

	public String getImagePathUrl() {
		return imagePathUrl;
	}

	public void setImagePathUrl(String imagePathUrl) {
		this.imagePathUrl = imagePathUrl;
	}

	
}

