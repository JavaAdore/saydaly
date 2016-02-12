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

import com.saydaly.common.entity.AbstractEntity;
import com.saydaly.common.entity.core.Lookup;

@Entity
@Table(name="client_purchace_order_rate")
@Cacheable
public class ClientPurchaceOrderRate extends AbstractEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue
	@Column
	private Long id;
	
	
	@ManyToOne
	@JoinColumn(name="public_client_id" , referencedColumnName="id")
	private PublicClient publicClient;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="feedback_date")
	private Date feedbackDate;
	
	private Integer stars;
	
	
	@ManyToOne
	@JoinColumn(name="purchace_order_id" , referencedColumnName ="id")
	private PurchaceOrder purchaceOrder;
	
	@ManyToOne
	@JoinColumn(name="pharamcy_branch" , referencedColumnName = "id")
	private PharmacyBranch pharmacyBranch;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PublicClient getPublicClient() {
		return publicClient;
	}

	public void setPublicClient(PublicClient publicClient) {
		this.publicClient = publicClient;
	}

	public Date getFeedbackDate() {
		return feedbackDate;
	}

	public void setFeedbackDate(Date feedbackDate) {
		this.feedbackDate = feedbackDate;
	}

	public PurchaceOrder getPurchaceOrder() {
		return purchaceOrder;
	}

	public void setPurchaceOrder(PurchaceOrder purchaceOrder) {
		this.purchaceOrder = purchaceOrder;
	}

	public PharmacyBranch getPharmacyBranch() {
		return pharmacyBranch;
	}

	public void setPharmacyBranch(PharmacyBranch pharmacyBranch) {
		this.pharmacyBranch = pharmacyBranch;
	}

	public Integer getStars() {
		return stars;
	}

	public void setStars(Integer stars) {
		this.stars = stars;
	}
	
	
	
	

}
