package springIdol;

public class Instrumentalist implements Performer {

    private Song song;
    private Instrument instrument;

    public Instrumentalist() {
    }

    public void perform() throws PerformanceException {
	System.out.println("Playing " + song.getSong() + " : ");
	instrument.play();
    }

    public void setSong(Song song) {
	this.song = song;
    }

    public void setInstrument(Instrument instrument) {
	this.instrument = instrument;

    }
}
