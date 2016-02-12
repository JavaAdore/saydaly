package com.saydaly.portal.managedbean.applicationhelper;

import java.util.Date;
import java.util.Map;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import com.saydaly.business.facade.SaydalyFacade;
import com.saydaly.common.util.Utils;
import com.saydaly.portal.constant.PortalConstants;
import com.saydaly.portal.webutils.WebUtils;

@ManagedBean
@ApplicationScoped
public abstract class AbstractBeanHelper {

	@ManagedProperty(value = "#{saydalyFacadeImp}")
	protected SaydalyFacade saydalyFacade;

	@ManagedProperty(value = "#{applicationScopeStore}")
	private ApplicationScopeStore applicationScopeStore;

	

	protected String getStringKey(java.lang.Long value) {
		StringBuffer sb = new StringBuffer();
		sb.append(value);
		return sb.toString();
	}

	protected java.lang.Long getKey(String value) {
		java.lang.Long key;
		key = Long.valueOf(value);
		return key;
	}

	public ApplicationScopeStore getApplicationScopeStore() {
		return applicationScopeStore;
	}

	public void setApplicationScopeStore(
			ApplicationScopeStore applicationScopeStore) {
		this.applicationScopeStore = applicationScopeStore;
	}

	protected void adjustDateToGreenWich(Map<String, Object> filters) {
		for (String key : filters.keySet()) {
			Object obj = filters.get(key);
			if (obj instanceof Date) {
				Integer deff = (Integer) WebUtils.extractFromSession(PortalConstants.DEFFERENT_HOURS_BETWEEN_USER_TIME_AND_GERENWICH_TIME);
				deff= (deff !=null)?deff:0;
				filters.put(key, Utils.addHours((Date) obj, deff*-1));
				
			}

		}
	}

	public SaydalyFacade getSaydalyFacade() {
		return saydalyFacade;
	}

	public void setSaydalyFacade(SaydalyFacade saydalyFacade) {
		this.saydalyFacade = saydalyFacade;
	}
	
	

}
