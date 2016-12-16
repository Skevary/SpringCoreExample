package scripting;

public class ScriptStarted {
    public ScriptStarted() {
    }

    public void showScripts() {
	System.out.println("Run script...");
	ruby.show();
	groovy.show();
	beanShell.show();
	bshFromTheConfigFile.show();
    }

    private Script ruby;
    private Script groovy;
    private Script beanShell;
    private Script bshFromTheConfigFile;
    
    public void setRuby(Script ruby) {
	this.ruby = ruby;
    }

    public void setGroovy(Script groovy) {
	this.groovy = groovy;
    }

    public void setBeanShell(Script beanShell) {
	this.beanShell = beanShell;
    }

    public void setBshFromTheConfigFile(Script bshFromTheConfigFile) {
        this.bshFromTheConfigFile = bshFromTheConfigFile;
    }
}
