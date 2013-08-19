package de.hoegertn;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/foo")
public interface ITest {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	String get();
	
}