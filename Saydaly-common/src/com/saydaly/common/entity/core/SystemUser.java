package com.saydaly.common.entity.core;

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

@Entity
@Table(name="system_user")
@Cacheable
public class SystemUser extends AbstractEntity implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	@GeneratedValue
	private Long id;

	@Column(name="email" , nullable=false , length=50 , unique=true )
	private String email;
	
	@Column(name="password" , nullable=false, length=500 )
	private String password;
	
	
	@ManyToOne()
	@JoinColumn(name="role_id" , referencedColumnName="id")
	@NotNull
	private Role role;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="password_expiry_date")
	@NotNull
	private Date passwordExpriyDate;
	
	
	@ManyToOne
	@JoinColumn(name="status_id" , referencedColumnName = "id")
	@NotNull
	private Lookup status;
	
	
	@ManyToOne
	@JoinColumn(name="country_id" , referencedColumnName="id")
	@NotNull
	private Country country;
	

	
	
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Date getPasswordExpriyDate() {
		return passwordExpriyDate;
	}

	public void setPasswordExpriyDate(Date passwordExpriyDate) {
		this.passwordExpriyDate = passwordExpriyDate;
	}

	public Lookup getStatus() {
		return status;
	}

	public void setStatus(Lookup status) {
		this.status = status;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	
	
	
}
