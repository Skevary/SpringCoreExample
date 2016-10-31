package springIdol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIdolMain {
	public static void main(String[] args) throws PerformanceException {
	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");
		
		System.out.print("\nDuke perform: ");
		Performer duke = (Performer) ctx.getBean("duke");
		duke.perform();
		
		System.out.print("Max perform: ");
		Performer max = (Performer) ctx.getBean("max");
		max.perform();
		
		System.out.print("Kenny perform: ");
		Performer kenny = (Performer) ctx.getBean("kenny");
		kenny.perform();
		
		System.out.print("Hank perform: ");
		Performer hank = (Performer) ctx.getBean("hank");
		hank.perform();
		
		System.out.print("Jim perform: ");
		Performer jim = (Performer) ctx.getBean("jim");
		jim.perform();
		
		System.out.print("Carl perform: ");
		Performer carl = (Performer) ctx.getBean("carl");
		carl.perform();
		
		((AbstractApplicationContext) ctx).close();

	}
}
