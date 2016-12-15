package cities;

public class City {

    /** Fields width been-collection */
    private String name;
    private String state;
    private int population;

    public void showItems() {
	System.out.println("Name:[" + name + "] State:[" + state + "] Population:[" + population + "]");
    }

    /** Getters and Setters */
    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public void setState(String state) {
	this.state = state;
    }

    public void setPopulation(int population) {
	this.population = population;
    }

    public String getState() {
	return state;
    }

    public int getPopulation() {
	return population;
    }

}
