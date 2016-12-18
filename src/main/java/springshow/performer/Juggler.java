package springshow.performer;

import springshow.PerformanceException;

public class Juggler implements Performer {
    private String name;
    private int beanBags = 3;

    public Juggler() {
    }

    public Juggler(int beanBags) {
	this.beanBags = beanBags;
    }

    public void perform() throws PerformanceException {
	System.out.println("JUGGLIMG " + beanBags + " BEANBAGS");
    }

    public void setName(String name) {
	this.name = name;
    }
}
