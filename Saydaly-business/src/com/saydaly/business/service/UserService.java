 package com.saydaly.business.service;

import javax.ejb.Local;

import com.saydaly.common.entity.core.SystemUser;

@Local
public interface UserService {

	SystemUser getSystemUser(String email);

	
}
