package com.saydaly.portal.managedbean;

import java.io.Serializable;
import java.util.Locale;

import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;

import com.saydaly.portal.managedbean.applicationhelper.AbstractBeanHelper;

@ManagedBean
@SessionScoped
public class UserSessionBean extends AbstractBeanHelper implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	private Locale userLocale = Locale.ENGLISH;
	
	public void changeLocale(String locale)
	{
		userLocale = new Locale(locale);
	}

	
	
	public Locale getUserLocale() {
		return userLocale;
	}

	public void setUserLocale(Locale userLocale) {
		this.userLocale = userLocale;
	}
	
	
	
}
