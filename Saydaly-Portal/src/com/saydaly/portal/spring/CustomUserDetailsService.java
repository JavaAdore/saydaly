package com.saydaly.portal.spring;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.saydaly.business.facade.SaydalyFacade;
import com.saydaly.common.entity.core.SystemUser;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@EJB
	private SaydalyFacade almabanyFacade;

	@PostConstruct
	public void init() {

	}

	@SuppressWarnings("unused")
	@Override
	public UserDetails loadUserByUsername(String userLoginCode)
			throws UsernameNotFoundException {
		System.out.println("Trying to fetch user with login: " + userLoginCode);
		final SystemUser user = almabanyFacade.getSystemUser(userLoginCode);
		if (user == null) {
			throw new UsernameNotFoundException("User not found");
		}
		CustomUserDetails details = new CustomUserDetails( user);

		return details;
	}

}
