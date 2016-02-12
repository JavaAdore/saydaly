package com.saydaly.portal.managedbean;
import java.io.Serializable;

import com.saydaly.portal.managedbean.applicationhelper.AbstractBeanHelper;

public class TestBean extends AbstractBeanHelper implements Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;

	public void test() {


		System.out.println("xx"); 
		
		myString();
	}
	
	
	public String myString()
	{
		return "welcome";
	}
}
