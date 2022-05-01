package in.nareshit.annotationConfig;

import javax.annotation.PostConstruct;

public class NonBeanClass {

	@PostConstruct
	public void beanMethod1()
	{
		System.out.println("Inside NonBeanClass");
	}
}
