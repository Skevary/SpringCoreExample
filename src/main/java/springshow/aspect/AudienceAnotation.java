package springshow.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.AfterThrowing;

@Aspect
public class AudienceAnotation {
    @Pointcut("execution(* springshow.performer.Performer.perform(..))")
    public void performance() {
    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinpoint) {
	try {
	    System.out.println("[The audience is taking their seats]");
	    System.out.println("[The audience is turning off their cellphones]");
	    long start = System.currentTimeMillis();
	    joinpoint.proceed();
	    long end = System.currentTimeMillis();
	    System.out.println("[The audience applauded] *CLAP CLAP CLAP CLAP CLAP*");
	    System.out.println("[The performance took] " + (end - start) + " milliseconds.");
	} catch (Throwable t) {
	    System.out.println("[Something went wrong] Boo! We want our money back!");
	}
    }
    
    /*
     * @Before("performance()")
     * public void takeSeats() {
     * System.out.println("[AOP:anotation] The audience is taking their seats.");
     * }
     * 
     * @Before("performance()") 
     * public void turnOffCellPhones() {
     * System.out.println("[AOP:anotation] The audience is turning off their cellphones");
     * }
     * 
     * @AfterReturning("performance()")
     * public void applaud() {
     * System.out.println("[AOP:anotation] CLAP CLAP CLAP CLAP CLAP");
     * }
     * 
     * @AfterThrowing("performance()")
     * public void demandRefund() { 
     * System.out.println("[AOP:anotation] Boo! We want our money back!");
     * } 
     */
}
