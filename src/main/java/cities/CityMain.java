package cities;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CityMain {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("city.xml");
		CitiesInstances citiesInstances = (CitiesInstances) ctx.getBean("cities");
		citiesInstances.printCitiesMap();
		citiesInstances.printCitiesArrayList();
		citiesInstances.printCitiesArrayListNames();
		
	}

}
