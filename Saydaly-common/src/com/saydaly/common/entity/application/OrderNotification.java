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
import com.saydaly.common.entity.core.SystemUser;

@Entity
@Table(name="order_notification")
@Cacheable
public class OrderNotification extends AbstractEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue
	@Column
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="purchace_order_id" , referencedColumnName = "id" )
	private PurchaceOrder purchaceOrder;
	
	@ManyToOne
	@JoinColumn(name="pharmacy_branch_id" , referencedColumnName = "id")
	private PharmacyBranch pharmacyBranch;
	
	@ManyToOne
	@JoinColumn(name="status_id"  , referencedColumnName = "id")
	private Lookup status;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="notification_date")
	private Date notificationDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="acceptance_date")
	private Date acceptanceDate;
	
	
	@ManyToOne
	@JoinColumn(name="accepted_by_system_user_id" , referencedColumnName="id")
	private SystemUser acceptedBy;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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


	public Lookup getStatus() {
		return status;
	}


	public void setStatus(Lookup status) {
		this.status = status;
	}


	public Date getNotificationDate() {
		return notificationDate;
	}


	public void setNotificationDate(Date notificationDate) {
		this.notificationDate = notificationDate;
	}


	public Date getAcceptanceDate() {
		return acceptanceDate;
	}


	public void setAcceptanceDate(Date acceptanceDate) {
		this.acceptanceDate = acceptanceDate;
	}


	public SystemUser getAcceptedBy() {
		return acceptedBy;
	}


	public void setAcceptedBy(SystemUser acceptedBy) {
		this.acceptedBy = acceptedBy;
	}
	
	
}
