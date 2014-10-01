package springbreak;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Greeter obj1 = (Greeter) context.getBean("greeter");
		Greeter obj2 = (Greeter) context.getBean("greeter");
		
		System.out.println(obj1.getMessage());
		obj1.setMessage("New Message");
		System.out.println(obj2.getMessage());

		context.registerShutdownHook();
	}

}
