package com.saydaly.business.serviceimp;

import java.util.Calendar;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.saydaly.business.service.UserService;
import com.saydaly.common.constant.ErrorCodeStore;
import com.saydaly.common.entity.core.Lookup;
import com.saydaly.common.entity.core.Role;
import com.saydaly.common.entity.core.SystemUser;
import com.saydaly.common.exception.SaydalyRuntimeException;
import com.saydaly.common.util.Utils;
import com.saydaly.dataacceess.dao.UserDAO;

@Stateless
public class UserServiceImpl implements UserService {

	@EJB
	UserDAO userDAO;

	@Override
	public SystemUser getSystemUser(String email) {

		if (Utils.isEmptyString(email)) {
			throw new SaydalyRuntimeException(ErrorCodeStore.BAD_PARAMETERS,
					"passed email equals null");
		}
		
		SystemUser systemUser = new SystemUser();
		systemUser.setEmail("Mahmoud@gmail.com");
		systemUser.setPassword("123456");
		systemUser.setRole(Role.SYSTEM_ADMINSTRATOR);
		systemUser.setStatus(Lookup.USER_STATUS_ACTIVE);
		 
		Calendar c = Calendar.getInstance();
		c.add(Calendar.YEAR, 10);
		
		systemUser.setPasswordExpriyDate(c.getTime());
		
		
		return systemUser;
	}

}
