package com.saydaly.common.entity.application;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.saydaly.common.entity.core.BaseAddress;

@Entity
@Table(name="public_client_address")
@PrimaryKeyJoinColumn(name="ID")  
public class PublicClientAddress extends BaseAddress implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="foloor_number")
	@NotNull
	private Integer floorNumber;
	
	@NotNull
	@Column(name="appartment_number")
	private String appartmentNumber;
	
	
	@ManyToOne
	@JoinColumn(name="public_client" , referencedColumnName = "id")
	private PublicClient publicClient;

	public Integer getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(Integer floorNumber) {
		this.floorNumber = floorNumber;
	}

	public String getAppartmentNumber() {
		return appartmentNumber;
	}

	public void setAppartmentNumber(String appartmentNumber) {
		this.appartmentNumber = appartmentNumber;
	}

	public PublicClient getPublicClient() {
		return publicClient;
	}

	public void setPublicClient(PublicClient publicClient) {
		this.publicClient = publicClient;
	}
	
}
