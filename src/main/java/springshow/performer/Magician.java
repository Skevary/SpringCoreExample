package springshow.performer;

import springshow.PerformanceException;
import springshow.performer.props.MagicBox;

public class Magician implements Performer {
    private String name;
    private String magicWords;
    private MagicBox magicBox;

    public Magician() {
    }

    public void perform() throws PerformanceException {
	System.out.println(magicWords);
	System.out.println("The magic box contains...");
	System.out.println(magicBox.getContents());
    }

    public void setMagicWords(String magicWords) {
	this.magicWords = magicWords;
    }

    public void setMagicBox(MagicBox magicBox) {
	this.magicBox = magicBox;
    }

    public void setName(String name) {
	this.name = name;
    }
}
