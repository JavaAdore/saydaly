package com.saydaly.common.entity.application;

import java.io.Serializable;
import java.util.Date;

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

import org.hibernate.annotations.Check;

import com.saydaly.common.entity.AbstractEntity;
import com.saydaly.common.entity.core.Lookup;


@Entity
@Table(name = "public_client")
@Check(constraints = " gender in ('m', 'f' , 'M' , 'F')" )
public class PublicClient extends AbstractEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name= "full_name" , length=50,nullable=false)
	private String fullName;
	
	@Column(name="email" , length=50 , nullable=false )
	private String email;
	
	@Column(name="phone_number" , length=20 , nullable=false)
	private String phoneNumber;
	
	@ManyToOne
	@NotNull
	@JoinColumn(name="status" , referencedColumnName = "id")
	private Lookup status;
	
	@Column(name="gender" , length = 1 )
	private String gender;
	
	@Column(name="password" , length = 50)
	private String password;
	
	@Column(name="facebook_user_id" , length=50)
	private String facebookUserId;
	
	
	@Column(name="facebook_access_taken" , length=50)
	private String facebookAccessTaken;
	
	@Column(name="saydaly_taken")
	private String saydaly_taken;
	
	@Column(name="birth_date")
	@Temporal(TemporalType.DATE)
	private Date birthday;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Lookup getStatus() {
		return status;
	}

	public void setStatus(Lookup status) {
		this.status = status;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFacebookUserId() {
		return facebookUserId;
	}

	public void setFacebookUserId(String facebookUserId) {
		this.facebookUserId = facebookUserId;
	}

	public String getFacebookAccessTaken() {
		return facebookAccessTaken;
	}

	public void setFacebookAccessTaken(String facebookAccessTaken) {
		this.facebookAccessTaken = facebookAccessTaken;
	}

	public String getSaydaly_taken() {
		return saydaly_taken;
	}

	public void setSaydaly_taken(String saydaly_taken) {
		this.saydaly_taken = saydaly_taken;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
	
}
