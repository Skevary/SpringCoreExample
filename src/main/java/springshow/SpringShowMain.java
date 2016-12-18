package springshow;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springshow.performer.Performer;

public class SpringShowMain {
    public static void main(String[] args) throws PerformanceException {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("springshow.xml");

	Performer performer1 = (Performer) ctx.getBean("max");
	Performer performer2 = (Performer) ctx.getBean("kenny");
	Performer performer3 = (Performer) ctx.getBean("hank");
	Performer performer4 = (Performer) ctx.getBean("carl");
	Performer performer5 = (Performer) ctx.getBean("harry");
	
	performer1.setName("Max");
	performer1.perform();
	performer2.setName("Kenny");
	performer2.perform();
	performer3.setName("Hank");
	performer3.perform();
	performer4.setName("Carl");
	performer4.perform();
	performer5.setName("Harry");
	performer5.perform();

	((AbstractApplicationContext) ctx).close();

    }
}
