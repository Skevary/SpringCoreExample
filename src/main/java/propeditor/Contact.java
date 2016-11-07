package propeditor;

import java.util.Map;

public class Contact {
	
	private Map<String, PhoneNumber> contact;
	
	public void setContact(Map<String, PhoneNumber> contact) {
		this.contact = contact;
	}
	
	public void setContact(String name, PhoneNumber number) {
		this.contact.put(name, number);
	}
	
	public void printContact() {
		for (String key : contact.keySet()) {
			System.out.print("Name: " + key + "; Contact number: ");
			PhoneNumber phoneNumber = contact.get(key);
			phoneNumber.printNumber();
		}
	}
}