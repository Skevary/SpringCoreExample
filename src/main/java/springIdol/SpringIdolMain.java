package springIdol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIdolMain {

	public static void main(String[] args) throws PerformanceException{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");
		Performer duke = (Performer) ctx.getBean("duke");
		duke.perform();
		Performer poeticMax = (Performer) ctx.getBean("poeticMax");
		poeticMax.perform();
		Performer kenny = (Performer)ctx.getBean("kenny");
		kenny.perform();
		((ClassPathXmlApplicationContext) ctx).close(); 
		
	}

}
