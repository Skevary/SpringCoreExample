package springshow.aspect;

public class Psychic implements MindReader {
    private String thoughts;

    public void interceptThoughts(String thoughts) {
	System.out.println("Intercepting volunteer’s thoughts");
	this.thoughts = thoughts;
    }

    public String getThoughts() {
	return thoughts;
    }
}
