package com.saydaly.business.facadeimp;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.saydaly.business.facade.SaydalyFacade;
import com.saydaly.business.service.UserService;
import com.saydaly.common.entity.core.SystemUser;



@Stateless(mappedName="ejb/saydaly/facadeimpl")
public class SaydalyFacadeImpl extends BusinessCache implements SaydalyFacade {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private UserService userService;

	@Override
	public SystemUser getSystemUser(String email) {
		
		return userService.getSystemUser(email);
	}


	
	



	
}
