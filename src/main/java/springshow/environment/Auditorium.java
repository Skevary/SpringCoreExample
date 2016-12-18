package springshow.environment;

public class Auditorium {

    public void turnOnLights() {
	System.out.println("[Init-method] Turn On Lights");
    }

    public void turnOffLights() {
	System.out.println("[Destroy-method] Turn Off Lights");
    }

}
