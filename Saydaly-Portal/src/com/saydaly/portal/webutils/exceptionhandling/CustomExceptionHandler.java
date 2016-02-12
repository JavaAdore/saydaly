package com.saydaly.portal.webutils.exceptionhandling;

import java.util.Iterator;

import javax.faces.FacesException;
import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerWrapper;
import javax.faces.event.ExceptionQueuedEvent;
import javax.faces.event.ExceptionQueuedEventContext;

import com.saydaly.common.exception.SaydalyException;
import com.saydaly.common.util.Utils;
import com.saydaly.portal.webutils.WebUtils;

public class CustomExceptionHandler extends ExceptionHandlerWrapper {

	private ExceptionHandler wrapped;

	CustomExceptionHandler(ExceptionHandler exception) {
		this.wrapped = exception;
	}

	@Override
	public ExceptionHandler getWrapped() {
		return wrapped;
	}

	@Override
	public void handle() throws FacesException {

		final Iterator<ExceptionQueuedEvent> i = getUnhandledExceptionQueuedEvents()
				.iterator();
		while (i.hasNext()) {
			ExceptionQueuedEvent event = i.next();
			ExceptionQueuedEventContext context = (ExceptionQueuedEventContext) event
					.getSource();

			// get the exception from context
			Throwable t = context.getException();

			// here you do what ever you want with exception
			try {

				// remove the comment below if you want to report the error in a
				// jsf error message
				Throwable ex = getRootCause(t);
				if (t instanceof SaydalyException) {
					WebUtils.fireErrorMessage(((SaydalyException) t).getKey());

				} else if (t.getCause() instanceof SaydalyException) {
					if (Utils.isEmptySet(((SaydalyException) t.getCause())
							.getParameters())) {
						WebUtils.fireErrorMessage(((SaydalyException) t
								.getCause()).getKey());
					} else {
						WebUtils.displayAlmabanyExceptionErrorMessage((SaydalyException) t
								.getCause());
					}  

				} else if (ex instanceof SaydalyException) {
					if (Utils.isEmptySet(((SaydalyException) ex)
							.getParameters())) {
						WebUtils.fireErrorMessage(((SaydalyException) ex)
								.getKey());
					} else { 
						WebUtils.displayAlmabanyExceptionErrorMessage(((SaydalyException) ex));
					}

				}

			} finally {
				// remove it from queue
				//i.remove();
			}    
		}
		// parent hanle
		//getWrapped().handle();
	}

}