package de.hoegertn;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;

/**
 * Copyright 2014 Cinovo AG<br>
 * <br>
 * 
 * @author thoeger
 * 
 */
public class TestAPI implements ITest {
	
	@Override
	public Response putBar() {
		final ResponseBuilder responseBuilder = Response.status(Status.ACCEPTED);
		responseBuilder.header("X-FOOBAR", "bar");
		return responseBuilder.build();
	}
	
	@Override
	public Response putBaz() {
		final ResponseBuilder responseBuilder = Response.status(Status.ACCEPTED);
		responseBuilder.header("X-FOOBAR", "baz");
		return responseBuilder.entity("baz").build();
	}
	
}
