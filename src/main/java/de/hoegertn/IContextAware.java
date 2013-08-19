package de.hoegertn;

import javax.ws.rs.core.Context;

import org.apache.cxf.jaxrs.ext.MessageContext;

public interface IContextAware {
	
	@Context
	void setMessageContext(MessageContext ctx);
	
}