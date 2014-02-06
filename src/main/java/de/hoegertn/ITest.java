package de.hoegertn;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/foo")
@SuppressWarnings("javadoc")
public interface ITest {
	
	@Path("/bar")
	@PUT
	Response putBar();
	
	@Path("/baz")
	@PUT
	Response putBaz();
	
}