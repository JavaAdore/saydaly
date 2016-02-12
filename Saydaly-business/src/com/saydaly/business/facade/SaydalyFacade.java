package com.saydaly.business.facade;


import javax.ejb.Local;

import com.saydaly.common.entity.core.SystemUser;

@Local
public interface SaydalyFacade {

	SystemUser getSystemUser(String email);

	



}
