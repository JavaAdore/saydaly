package com.saydaly.portal.managedbean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.saydaly.common.exception.SaydalyException;
import com.saydaly.portal.constant.PortalConstants;
import com.saydaly.portal.webutils.WebUtils;

@ManagedBean
@ViewScoped
public class LoginBean implements Serializable {

	Logger logger = Logger.getLogger(LoginBean.class);
	
	@ManagedProperty(value = "#{authenticationManager}")
	private AuthenticationManager authenticationManager;

	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;

	public static boolean awsDataBase;


	@PostConstruct
	public void init() {

	}


	public AuthenticationManager getAuthenticationManager() {
		return authenticationManager;
	}

	public void setAuthenticationManager(
			AuthenticationManager authenticationManager) {
		this.authenticationManager = authenticationManager;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void login() throws SaydalyException {

		try {
			logger.debug("start authentication " + getUserName());
			
			Authentication request = new UsernamePasswordAuthenticationToken(
					this.getUserName(), this.getPassword());
		
			Authentication result = authenticationManager.authenticate(request);
			SecurityContextHolder.getContext().setAuthentication(result);
			
			WebUtils.injectIntoSession("SPRING_SECURITY_CONTEXT",
					SecurityContextHolder.getContext());
			logger.debug( getUserName() +" Authenticated successfully"
					+ "");

			WebUtils.redirectTo(PortalConstants.HOME_PAGE);
		}

		catch (Exception ex) {
			logger.error("error while authenticating " + getUserName() , ex);
			WebUtils.displayAlmabanyExceptionErrorMessage(new SaydalyException(
					ex.getMessage()));
		}
	}

}