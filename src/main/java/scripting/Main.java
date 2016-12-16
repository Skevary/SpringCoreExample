package scripting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
	@SuppressWarnings("resource")
	ApplicationContext context = new ClassPathXmlApplicationContext("scripting.xml");
	ScriptStarted scriptStarted = (ScriptStarted) context.getBean("scriptStarted");
	scriptStarted.showScripts();
    }

}
