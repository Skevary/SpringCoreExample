package springIdol;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MindReaderTest {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");
    MindReader psychic = (MindReader) ctx.getBean("psychic");
    Thinker volunteer = (Thinker) ctx.getBean("volunteer");

    @Test
    public void magicianShouldReadVolunteersMind() {
	volunteer.thinkOfSomething("Queen of Hearts");
	assertEquals("Queen of Hearts", psychic.getThoughts());
    }

}
