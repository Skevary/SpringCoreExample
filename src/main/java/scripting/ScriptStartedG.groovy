class ScriptStartedG implements scripting.IScriptStarted {
public void showScripts(){
		println ""
		println "This's ScriptStarted.groovy"
		println "Run script..."
		script.show()
	}
	scripting.Script script;
}