package in.nareshit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.nareshit.annotationConfig.ConfigBean;
import in.nareshit.annotationConfig.InitialClass;
import in.nareshit.annotationConfig.SingletonInsideProto;
import in.nareshit.annotationConfig.ThePrototype;
import in.nareshit.annotationConfig.TheSingleton;

public class Test {

	public static void main(String[] args) {
		getXmlBeans();
		getAnnotationConfigBeans(); 
		getFromProps();
		testScopes();
		testPreDefinedBeansCreation();
		getAnnotationConfigWithComponentScan();
				
	}
	
	private static void getXmlBeans()
	{
		System.out.println("From xml beans method");
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		Object ob = ac.getBean("myResolver");
		Object ob1 = ac.getBean("securityModel");
		Object ob2 = ac.getBean("mySecurityModel");
		Object ob3 = ac.getBean("mySecurityModel1");
		System.out.println(ob);
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
		
	}
	
	private static void getAnnotationConfigBeans()
	{
		System.out.println("From annotationConfigBeans method");
		AnnotationConfigApplicationContext ac1 = new AnnotationConfigApplicationContext();
		ac1.scan("in.nareshit.annotationConfig");
		ac1.refresh();
		System.out.println(ac1.getBean("dbCon"));

		
	}
	
	private static void getAnnotationConfigWithComponentScan()
	{
		System.out.println("From annotationConfigWithComponentScan method");
		AnnotationConfigApplicationContext ac2 = new AnnotationConfigApplicationContext(InitialClass.class);
		System.out.println(ac2.getBean("dbCon"));
		System.out.println("creating singletonInsideProto");
		System.out.println(((SingletonInsideProto)(ac2.getBean("sip"))).getTp());
		System.out.println(((SingletonInsideProto)(ac2.getBean("sip"))).getTp());
		System.out.println(((ThePrototype)(ac2.getBean("tp"))));

	}
	
	private static void getFromProps()
	{
		System.out.println("From getFromProps method");
		AnnotationConfigApplicationContext ac2 = new AnnotationConfigApplicationContext(InitialClass.class);
		System.out.println(ac2.getBean("ecobj"));

	}
	
	private static void testScopes()
	{
		System.out.println("From testSCopes method");
		AnnotationConfigApplicationContext ac2 = new AnnotationConfigApplicationContext(InitialClass.class);
		System.out.println("first instance ts "+ac2.getBean("ts"));
		System.out.println("first instance tp "+ac2.getBean("tp"));
		System.out.println("second instance ts "+ac2.getBean("ts"));
		System.out.println("second instance tp "+ac2.getBean("tp"));
		System.out.println("sip first instance "+ac2.getBean("sip"));
		SingletonInsideProto tsip = (SingletonInsideProto)ac2.getBean("sip");
		System.out.println("sip second instance "+tsip.toString());
		System.out.println("tp inside sip second instance "+tsip.getTp().toString());
		System.out.println("tp inside sip third instance "+tsip.getTp().toString());
	}
	
	private static void testPreDefinedBeansCreation()
	{
		System.out.println("From testPreDefinedBeansCreation method");
		AnnotationConfigApplicationContext ac2 = new AnnotationConfigApplicationContext(InitialClass.class);
		System.out.println("first instance ts "+ac2.getBean("nbc"));
		System.out.println("second instance ts "+ac2.getBean("nbc"));
		System.out.println("second instance ts "+ac2.getBean("cb"));

	}
	
}
