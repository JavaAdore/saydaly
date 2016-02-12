package com.saydaly.common.entity.core;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.saydaly.common.entity.AbstractEntity;

@Entity
@Table
@Cacheable
public class Role extends AbstractEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public final static Role SYSTEM_ADMINSTRATOR = new Role(1l,"SYSTEM_ADMINSTRATOR");
	
	public final static Role SAYDALYA_ADMINSTRATOR = new Role(2L,"SAYDALYA_ADMINSTRATOR");
	
	public final static Role PUBLIC_CLIENT = new Role(3L,"PUBLIC_CLIENT");

	
	@Id
	@GeneratedValue
	@Column
	private Long id;
	
	@Column(name="role_name" ,nullable=false ,length=25,unique=true)
	private String roleName;
	
	@Column(name="role_description")
	private String roleDescription;

	public Role()
	{
		
	}
	
	
	public Role(Long id) {
		this(id , null);
	}
	
	public Role(Long id, String roleName) {
		super();
		this.id = id;
		this.roleName = roleName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleDescription() {
		return roleDescription;
	}
	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}
	
	

}
