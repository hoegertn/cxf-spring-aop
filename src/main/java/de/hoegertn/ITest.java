package de.hoegertn;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/foo")
@SuppressWarnings("javadoc")
public interface ITest {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	String get();
	
	@Path("/bar")
	@PUT
	Response putBar();
	
	@Path("/baz")
	@PUT
	Response putBaz();
	
}