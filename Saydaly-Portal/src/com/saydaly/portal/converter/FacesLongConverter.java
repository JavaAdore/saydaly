package com.saydaly.portal.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.saydaly.common.util.Utils;

@FacesConverter("longConverter")
public class FacesLongConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		Long longValue = null;
		if (Utils.isEmptyStringOrNotNumericValue(value)) {
			return null;
		}

		longValue = Long.parseLong(value);
		return longValue != null ? longValue : value;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		return Long.compare((long) value, 0) == 0 ? null : ((Long) value)
				.toString();
	}

}
