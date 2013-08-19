package de.hoegertn;

import org.springframework.transaction.annotation.Transactional;

public class TestAPI extends AbstractService implements ITest/* , IContextAware */{
	
	@Override
	@Transactional
	public String get() {
		System.out.println(this.context);
		System.out.println(this.context.getRequest().getMethod());
		return "Hello, world";
	}
	
}
