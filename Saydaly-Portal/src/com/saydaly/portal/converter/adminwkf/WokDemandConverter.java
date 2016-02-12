//package com.saydaly.portal.converter.adminwkf;
//
//import javax.faces.bean.ApplicationScoped;
//import javax.faces.bean.ManagedBean;
//import javax.faces.component.UIComponent;
//import javax.faces.context.FacesContext;
//import javax.faces.convert.Converter;
//
//import com.saydaly.common.entity.schema.adminwkf.WokDemand;
//import com.saydaly.common.util.Utils;
//import com.saydaly.portal.managedbean.applicationhelper.AbstractBeanHelper;
//
//@ManagedBean
//@ApplicationScoped
//public class WokDemandConverter extends AbstractBeanHelper implements Converter {
//
//	
//	public Object getAsObject(FacesContext facesContext, UIComponent component,
//			String value) {
//		if (Utils.isEmptyStringOrNotNumericValue(value)) {
//			return null;
//		}
//		  
//		return saydalyFacade.getWokDemand(getKey(value));
//	}
//
//	
//
//	public String getAsString(FacesContext facesContext, UIComponent component,
//			Object object) {
//		if (object == null) {
//			return null;
//		}
//		if (object instanceof WokDemand) {
//			WokDemand o = (WokDemand) object;
//			return getStringKey(o.getId());
//		} 
//		return null;
//	}
//
//}
