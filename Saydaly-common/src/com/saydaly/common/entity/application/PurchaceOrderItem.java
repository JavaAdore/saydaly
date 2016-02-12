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
@Table(name="Purchace_Order_Item")
@Cacheable
public class PurchaceOrderItem extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column
	private Long id;

	@ManyToOne
	@JoinColumn(name="product_id" , referencedColumnName ="id")
	private Product product;
	
	
	private Integer quantity = 1;
	
	@Column(name="estimated_price_per_unit")
	private Double estimatedPricePerUnit;
	
	
	@Column(name="estimated_order_item_price")
	private Double estimatedOrderItemPrice;
	
	@ManyToOne
	@JoinColumn(name="purchace_order_id" , referencedColumnName ="id")
	private PurchaceOrder purchaceOrder;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getEstimatedPricePerUnit() {
		return estimatedPricePerUnit;
	}

	public void setEstimatedPricePerUnit(Double estimatedPricePerUnit) {
		this.estimatedPricePerUnit = estimatedPricePerUnit;
	}

	public Double getEstimatedOrderItemPrice() {
		return estimatedOrderItemPrice;
	}

	public void setEstimatedOrderItemPrice(Double estimatedOrderItemPrice) {
		this.estimatedOrderItemPrice = estimatedOrderItemPrice;
	}

	public PurchaceOrder getPurchaceOrder() {
		return purchaceOrder;
	}

	public void setPurchaceOrder(PurchaceOrder purchaceOrder) {
		this.purchaceOrder = purchaceOrder;
	}
	
	
	
	
}
