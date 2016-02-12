package com.saydaly.common.exception;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class SaydalyRuntimeException extends RuntimeException implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private String key;
	
	private Object wrappedObject;
	
	

	public SaydalyRuntimeException(String key, Object wrappedObject) {
		super();
		this.key = key;
		this.wrappedObject = wrappedObject;
	}

	public SaydalyRuntimeException(String key, Object wrappedObject,
			Set<String> parameters) {
		super();
		this.key = key;
		this.wrappedObject = wrappedObject;
		this.parameters = parameters;
	}

	/**
	 * 
	 */
	
	
	public Object getWrappedObject() {
		return wrappedObject;
	}

	public void setWrappedObject(Object wrappedObject) {
		this.wrappedObject = wrappedObject;
	}

	public Set<String> getParameters() {
		return parameters;
	}

	public void setParameters(Set<String> parameters) {
		this.parameters = parameters;
	}

	private Set<String> parameters;

	public SaydalyRuntimeException() {
	}

	public SaydalyRuntimeException(String key) {
		this.key = key;
	}

	
	public SaydalyRuntimeException(Object wrappedObject) {
		super();
		this.wrappedObject = wrappedObject;
	}

	public SaydalyRuntimeException(Throwable cause, String key) {
		super(cause);
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	public void attachParameter(String param)
	{
		if(parameters==null)
		{
			parameters = new LinkedHashSet<String>();
		}
		parameters.add(param);
	}

}
