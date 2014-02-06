package de.hoegertn;

import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.JAXRSClientFactoryBean;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.util.StringUtils;

@SuppressWarnings("javadoc")
public class TestHeaders {
	
	@Test
	public void testBar() {
		System.out.println("Bar");
		Response putBar = TestHeaders.testAPI().putBar();
		System.out.println(putBar.getStatus());
		this.printHeaders(putBar);
	}
	
	@Test
	public void testBaz() {
		System.out.println("Baz");
		Response putBaz = TestHeaders.testAPI().putBaz();
		System.out.println(putBaz.getStatus());
		this.printHeaders(putBaz);
	}
	
	private void printHeaders(Response putBar) {
		System.out.println("Headers");
		Set<Entry<String, List<String>>> stringHeaders = putBar.getStringHeaders().entrySet();
		Assert.assertTrue(stringHeaders.size() > 0);
		for (Entry<String, List<String>> entry : stringHeaders) {
			System.out.println("  " + entry.getKey() + ": " + StringUtils.arrayToCommaDelimitedString(entry.getValue().toArray()));
		}
	}
	
	private static ITest testAPI() {
		return TestHeaders.api(ITest.class);
	}
	
	private static <T> T api(Class<T> clazz) {
		JAXRSClientFactoryBean bean = new JAXRSClientFactoryBean();
		bean.setAddress("http://localhost:8080/api");
		bean.setServiceClass(clazz);
		return bean.create(clazz);
	}
}
