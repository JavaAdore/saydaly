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
@Table(name="public_client_reports")
@Cacheable
public class publicClientReport extends AbstractEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue
	@Column
	private Long id;
	
	
	@ManyToOne
	@JoinColumn(name="public_client_id" , referencedColumnName="id")
	private PublicClient publicClient;
	
	
	@ManyToOne
	@JoinColumn(name="purchace_order_id" , referencedColumnName = "id")
	private PurchaceOrder purchaceOrder;
	
	@Column(name="report_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date reportDate;
	
	@ManyToOne 
	@JoinColumn(name="reported_by" , referencedColumnName="id")
	private SystemUser reportedBy;

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

	public PurchaceOrder getPurchaceOrder() {
		return purchaceOrder;
	}

	public void setPurchaceOrder(PurchaceOrder purchaceOrder) {
		this.purchaceOrder = purchaceOrder;
	}

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public SystemUser getReportedBy() {
		return reportedBy;
	}

	public void setReportedBy(SystemUser reportedBy) {
		this.reportedBy = reportedBy;
	}
	

}
