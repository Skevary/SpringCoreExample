package springshow.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.After;

@Aspect
public class Entertainer {
    @Pointcut("execution(* springshow.performer.Performer.setName(String)) && args(name)")
    public void setName(String name) {
    }

    @After("setName(name)")
    public void announcing(String name) {
	try {
	    System.out.println();
	    System.out.printf("[Entertainer says] Performs on stage - *%s*\n", name);
	} catch (Throwable e) {
	    e.printStackTrace();
	}
    }
}
