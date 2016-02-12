package com.saydaly.portal.spring;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.saydaly.common.entity.core.SystemUser;
//import com.saydaly.common.entity.schema.adminsec.Object;
import com.saydaly.common.util.Utils;

public class CustomUserDetails implements UserDetails {

	private static final long serialVersionUID = 1L;



	private SystemUser user;

	public CustomUserDetails(SystemUser user) {
		super();
		this.user = user;
	}

	@Override
	public boolean isEnabled() {
		return user.getStatus().isActive();
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return user.getPasswordExpriyDate().after(new Date());
	}

	@Override
	public boolean isAccountNonLocked() {
		return user.getStatus().isActive()==true;
	}

	@Override
	public boolean isAccountNonExpired() {
		return user.getStatus().isActive()==true;

	}

	@Override
	public String getUsername() {
		return user.getEmail();
	}  
 
	@Override
	public String getPassword() {
		return user.getPassword();
	}

	List<GrantedAuthority> auths = new ArrayList<GrantedAuthority>();

	@Override
	public Collection<GrantedAuthority> getAuthorities() {
		if(Utils.isEmptyCollection(auths))
		{
			GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(user.getRole().getRoleName().trim());
			auths.add(grantedAuthority);
		}
		return auths;
	}

	
	public SystemUser getUser() {
		return user;
	}

	public void setUser(SystemUser user) {
		this.user = user;
	}



}
