package springIdol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIdolMain {
    public static void main(String[] args) throws PerformanceException {

	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");

	System.out.print("*Max perform*");
	Performer poeticJuggler = (Performer) ctx.getBean("max");
	poeticJuggler.perform();

	System.out.print("*Kenny perform*");
	Performer instrumentalist = (Performer) ctx.getBean("kenny");
	instrumentalist.perform();

	System.out.print("*Jim perform*");
	Performer oneManBand = (Performer) ctx.getBean("jim");
	oneManBand.perform();

	System.out.print("*Harry perform*");
	Performer magican = (Performer) ctx.getBean("harry");
	magican.perform();

	((AbstractApplicationContext) ctx).close();

    }
}
