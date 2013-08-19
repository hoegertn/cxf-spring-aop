package de.hoegertn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
	
	private static ClassPathXmlApplicationContext context;
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Starter.context = new ClassPathXmlApplicationContext("spring/beans.xml");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Starter.context.stop();
	}
	
}
