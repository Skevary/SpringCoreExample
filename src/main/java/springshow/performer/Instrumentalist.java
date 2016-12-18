package springshow.performer;

import springshow.PerformanceException;
import springshow.performer.props.Instrument;
import springshow.performer.props.Song;

public class Instrumentalist implements Performer {
    private String name;
    private Song song;
    private Instrument instrument;

    public Instrumentalist() {
    }

    public void perform() throws PerformanceException {
	System.out.println("Playing " + song.getSong() + " : ");
	instrument.play();
    }

    public void setName(String name) {
	this.name = name;
    }

    public void setSong(Song song) {
	this.song = song;
    }

    public void setInstrument(Instrument instrument) {
	this.instrument = instrument;
    }
}
