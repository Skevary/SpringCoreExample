package springIdol;

public class Instrument {
    private String sound;

    public void play() {
	System.out.println(sound);
    }

    public String getSound() {
	return sound;
    }

    public void setSound(String sound) {
	this.sound = sound;
    }

}
