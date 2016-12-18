package springshow.performer;

import java.util.Collection;

import springshow.PerformanceException;
import springshow.performer.props.Instrument;

public class OneManBand implements Performer {

    public OneManBand() {
    }

    @Override
    public void perform() throws PerformanceException {
	for (Instrument instrument : instruments) {
	    instrument.play();
	}
    }

    private Collection<Instrument> instruments;

    public void setInstruments(Collection<Instrument> instruments) {
	this.instruments = instruments;
    }

}
