package postprocessor;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RabbitMain {

    public static void main(String[] args) {

	@SuppressWarnings("resource")
	ApplicationContext context = new ClassPathXmlApplicationContext("postprocessor.xml");
	Rabbit bugsBunny = (Rabbit) context.getBean("bugs");
	bugsBunny.say();

	Locale locale = new Locale("es", "ES");
	String text = context.getMessage("computer", new Object[0], locale);
	System.out.println(text);

    }

}
