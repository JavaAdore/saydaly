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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.saydaly.common.entity.AbstractEntity;
import com.saydaly.common.entity.core.Lookup;

@Entity
@Table(name = "pharmacy_phone_number")
@Cacheable
public class PharmacyPhoneNumber extends AbstractEntity implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue
	private Long id;
	
	
	@ManyToOne
	@JoinColumn(name="branch_id" , referencedColumnName = "id")
	private PharmacyBranch pharmacyBranch;
	
	@Column(name="phone_number")
	private String number;
	
	@Column(name="mobile" , length = 1)
	private Integer mobile = 0;
	
	@ManyToOne
	@JoinColumn(name="status_id" , referencedColumnName = "id")
	private Lookup status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PharmacyBranch getPharmacyBranch() {
		return pharmacyBranch;
	}

	public void setPharmacyBranch(PharmacyBranch pharmacyBranch) {
		this.pharmacyBranch = pharmacyBranch;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Integer getMobile() {
		return mobile;
	}

	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}

	public Lookup getStatus() {
		return status;
	}

	public void setStatus(Lookup status) {
		this.status = status;
	}
	
	
	
}
