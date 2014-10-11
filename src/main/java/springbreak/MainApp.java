package springbreak;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Greeter obj1 = (Greeter) context.getBean("greeterSingleton");
		Greeter obj2 = (Greeter) context.getBean("greeterSingleton");
		
		System.out.println(obj1.getMessage());
		obj1.setMessage("Verifying Singleton");
		System.out.println(obj2.getMessage());
		
		TextEditor editor = (TextEditor) context.getBean("textEditor");
		
		editor.spellCheck();
		editor.getLanguageList();
		editor.getTextSize();
		editor.getSpellChecker().getSpellCheckLevel();
		
		context.registerShutdownHook();
	}

}
