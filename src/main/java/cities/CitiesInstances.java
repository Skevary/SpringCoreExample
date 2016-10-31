package cities;

import java.util.ArrayList;
import java.util.Map;

public class CitiesInstances {
	/** Collection width City-fields */
	private Map<String, City> citiesMap;
	private ArrayList<City> citiesArrayList;
	private ArrayList<String> citiesArrayListNames;
	
	/** Print method width show in console Collection */
	public void printCitiesMap() {
		for (String key : citiesMap.keySet()) {
			System.out.print(key + "	- ");
			City city = citiesMap.get(key);
			city.showItems();
		}
	}
	public void printCitiesArrayList(){
		int i=0;
		for (City city : citiesArrayList) {
			System.out.print("ArrayListCity["+ i++ +"]"+"	- ");
			city.showItems();
		}
	}
	
	public void printCitiesArrayListNames(){
		int i=0;
		for (String name: citiesArrayListNames) {
			System.out.println("CitiesListNames["+ i++ +"]"	+"	- "+ name);
		}
	}

	/** Setters width collection */
	public void setCitiesMap(Map<String, City> cityInstances) {
		this.citiesMap = cityInstances;
	}

	public void setCitiesArrayList(ArrayList<City> citiesArrayList) {
		this.citiesArrayList = citiesArrayList;
		}
	
	public void setСitiesArrayListNames(ArrayList<String> citiesArrayListNames) {
		this.citiesArrayListNames = citiesArrayListNames;
	}

	}

