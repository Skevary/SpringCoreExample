package scripting;

public class Coconut {
    public Coconut() {
    }

    public void drinkThemBothUp() {
	System.out.println("Run script...");
	ruby.show();
    }

    private Script ruby;
    
    public void setRuby(Script ruby) {
	this.ruby = ruby;
    }

}
