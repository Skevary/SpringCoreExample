package propeditor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContactMain {

    public static void main(String[] args) {
	@SuppressWarnings("resource")
	ApplicationContext context = new ClassPathXmlApplicationContext("prop-editor.xml");
	Contact contact = (Contact) context.getBean("contact");
	contact.printContact();
    }

}
