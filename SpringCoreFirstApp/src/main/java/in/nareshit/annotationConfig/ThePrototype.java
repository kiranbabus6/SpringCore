package in.nareshit.annotationConfig;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("tp")
@Scope("prototype")
public class ThePrototype {

	public ThePrototype()
	{
		System.out.println("Inside Theprototype constructor");
	}
}
