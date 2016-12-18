package springshow.performer;

import java.util.Map;

import springshow.PerformanceException;
import springshow.performer.props.Instrument;

public class OneManBandMap implements Performer {

    public OneManBandMap() {
    }

    @Override
    public void perform() throws PerformanceException {
	for (String key : instruments.keySet()) {
	    System.out.println(key + " : ");
	    Instrument instrument = instruments.get(key);
	    instrument.play();
	}

    }

    private Map<String, Instrument> instruments;

    public void setInstruments(Map<String, Instrument> instruments) {
	this.instruments = instruments;
    }

}
