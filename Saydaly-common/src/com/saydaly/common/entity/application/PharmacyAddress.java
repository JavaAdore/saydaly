package com.saydaly.common.entity.application;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.saydaly.common.entity.core.BaseAddress;

@Entity
@Table(name="pharmacy_address")
@PrimaryKeyJoinColumn(name="ID")  
public class PharmacyAddress extends BaseAddress implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="in_mall")
	private Integer inMall = 0;

	public Integer getInMall() {
		return inMall;
	}

	public void setInMall(Integer inMall) {
		this.inMall = inMall;
	}
	
	
	
}
