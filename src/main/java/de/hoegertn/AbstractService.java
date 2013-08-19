package de.hoegertn;

import org.apache.cxf.jaxrs.ext.MessageContext;

public class AbstractService implements IContextAware {
	
	protected MessageContext context;
	
	
	@Override
	public void setMessageContext(MessageContext context) {
		this.context = context;
	}
}
