package in.nareshit.annotationConfig;

import org.springframework.stereotype.Component;

@Component("ts")
public class TheSingleton {

	
	public TheSingleton()
	{
		System.out.println("Inside TheSingleton constructor");
	}
	
}
