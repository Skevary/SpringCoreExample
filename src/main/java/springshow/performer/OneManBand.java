package springshow.performer;

import java.util.Collection;

import springshow.PerformanceException;
import springshow.performer.props.Instrument;

public class OneManBand implements Performer {
    private String name;
    private Collection<Instrument> instruments;

    public OneManBand() {
    }

    public void perform() throws PerformanceException {
	for (Instrument instrument : instruments) {
	    instrument.play();
	}
    }

    public void setInstruments(Collection<Instrument> instruments) {
	this.instruments = instruments;
    }

    public void setName(String name) {
	this.name = name;
    }
}
