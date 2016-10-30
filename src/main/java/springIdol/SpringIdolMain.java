package springIdol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIdolMain {

	public static void main(String[] args) throws PerformanceException {
	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");
		System.out.println("--Duke perform--");
		Performer duke = (Performer) ctx.getBean("duke");
		duke.perform();
		System.out.println("--PoeticMax perform--");
		Performer poeticMax = (Performer) ctx.getBean("poeticMax");
		poeticMax.perform();
		System.out.println("--Kenny perform--");
		Performer kenny = (Performer) ctx.getBean("kenny");
		kenny.perform();
		System.out.println("--Hank perform--");
		Performer hank = (Performer) ctx.getBean("hank");
		hank.perform();
		System.out.println("--Jim perform--");
		Performer jim = (Performer) ctx.getBean("jim");
		jim.perform();
		System.out.println("--Carl perform--");
		Performer carl = (Performer) ctx.getBean("carl");
		carl.perform();
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
