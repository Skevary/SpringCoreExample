package foo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FooMain {

    public static void main(String[] args) {
	@SuppressWarnings("resource")
	ApplicationContext context = new ClassPathXmlApplicationContext("foo.xml");
	Course course = (Course) context.getBean("refreshListener");
	context.publishEvent(new CourseFullEvent(new Object(), course));
    }

}
