package com.saydaly.portal.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.springframework.security.core.context.SecurityContext;
    
public class SessionCapturerListener implements HttpSessionListener{

//	private static final Map<SecUser ,SessionDetailsHolder > sessionMap = new LinkedHashMap();
	
	@Override
	public void sessionCreated(HttpSessionEvent httpSessionEvent) {

		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
		SecurityContext securityContext = (SecurityContext) 	httpSessionEvent.getSession().getAttribute("SPRING_SECURITY_CONTEXT");

//		if(Utils.isNotNull(securityContext) && Utils.isNotNull( securityContext.getAuthentication())  && Utils.isNotNull(securityContext.getAuthentication().getPrincipal()))
//		{
//			if(Utils.isObjectInstanceOf(securityContext.getAuthentication().getPrincipal(), CustomUserDetails.class))
//			{
//				SecUser currentSecUser = ((CustomUserDetails)	securityContext.getAuthentication().getPrincipal()).getUser();
//				sessionMap.remove(currentSecUser);
//			}
//		}
//		
	}

//	public static Map<SecUser, SessionDetailsHolder> getSessionmap() {
//		return sessionMap;
//	}

	  
}
