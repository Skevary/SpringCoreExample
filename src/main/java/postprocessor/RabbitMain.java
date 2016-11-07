package postprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RabbitMain {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("postprocessor.xml");
		Rabbit bugsBunny= (Rabbit) context.getBean("bugs");
		bugsBunny.say();

	}

}
