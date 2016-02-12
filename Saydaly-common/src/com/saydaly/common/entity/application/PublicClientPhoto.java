package com.saydaly.common.entity.application;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="public_client_photo")
public class PublicClientPhoto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@OneToOne
	@JoinColumn(name="public_client_id" , referencedColumnName="id")
	private PublicClient publicClient;
	
	@Column(name = "photo_path")
	private String photoPath;

	public PublicClient getPublicClient() {
		return publicClient;
	}

	public void setPublicClient(PublicClient publicClient) {
		this.publicClient = publicClient;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
	
	
	

}
