package in.nareshit.annotationConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("cb")
public class ConfigBean {

	@Bean(name="nbc")
	  public  NonBeanClass  nbcMethod() {
		  NonBeanClass ds = new NonBeanClass();
			return ds;
	  }
	
}
