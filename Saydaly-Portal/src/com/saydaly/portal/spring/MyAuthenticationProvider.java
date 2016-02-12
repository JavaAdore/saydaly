package com.saydaly.portal.spring;

import javax.ejb.EJB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.saydaly.business.facade.SaydalyFacade;
import com.saydaly.common.constant.MessagesKeyStore;
import com.saydaly.common.entity.core.SystemUser;
import com.saydaly.common.util.Utils;

@Service
public class MyAuthenticationProvider extends
		AbstractUserDetailsAuthenticationProvider {

	@Autowired
	private CustomUserDetailsService userDetailsService;

	@EJB
	private SaydalyFacade saydalyFacade;

	@Override
	public Authentication authenticate(Authentication authentication)
			throws AuthenticationException {
		return super.authenticate(authentication);
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return true;
	}

	@Override
	protected void additionalAuthenticationChecks(UserDetails userDetails,
			UsernamePasswordAuthenticationToken authentication)
			throws AuthenticationException {

		checkUserActivity(((CustomUserDetails) userDetails).getUser());
		if (Utils.isNotNull(userDetails.getPassword())
				&& Utils.isNotNull(authentication.getCredentials())
				&& Utils.isNotNull(authentication.getCredentials().toString())) {
			if (Utils.isNotNull(userDetails.getPassword())) {
				if (userDetails.getPassword().equals(
						authentication.getCredentials().toString()) == false) {
					throw new BadCredentialsException(
							MessagesKeyStore.APPLICATION_GENERAL_BAD_CREDENTIALS);
				}
			}
		}

	}

	//
	private void checkUserActivity(SystemUser user) {
		if (user.getStatus().isActive() == false) {
			throw new BadCredentialsException(
					MessagesKeyStore.APPLICATION_GENERAL_IN_ACTIVE_USER);
		}
	}

	@Override
	protected UserDetails retrieveUser(String username,
			UsernamePasswordAuthenticationToken authentication)
			throws AuthenticationException {
		UserDetails userDetails = userDetailsService
				.loadUserByUsername(username);
		return userDetails;

	}

}
