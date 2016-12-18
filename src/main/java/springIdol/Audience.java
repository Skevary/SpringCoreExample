package springIdol;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
    public void watchPerformance(ProceedingJoinPoint joinpoint) {
	 try {
	 System.out.println("The audience is taking their seats.");
	 System.out.println("The audience is turning off their cellphones");
	 long start = System.currentTimeMillis(); // Перед выступлением
	 long end = System.currentTimeMillis(); // После выступления
	 System.out.println("CLAP CLAP CLAP CLAP CLAP");
	 System.out.println("The performance took " + (end - start)
	 + " milliseconds.");
	 } catch (Throwable t) {
	 System.out.println("Boo! We want our money back!");
	 }
}
}