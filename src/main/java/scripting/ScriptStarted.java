package scripting;

public class ScriptStarted {
    public ScriptStarted() {
    }

    public void showScripts() {
	System.out.println("Run script...");
	ruby.show();
	groovy.show();
    }

    private Script ruby;
    private Script groovy;
    
    public void setRuby(Script ruby) {
	this.ruby = ruby;
    }

    public void setGroovy(Script groovy) {
        this.groovy = groovy;
    }
}
