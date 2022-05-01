package in.nareshit.annotationConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "in.nareshit")
@PropertySource("classpath:email.properties")
public class InitialClass {

}
