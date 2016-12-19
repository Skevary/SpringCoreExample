package springshow.performer;

import springshow.PerformanceException;
import springshow.performer.props.Poem;

public class PoeticJuggler extends Juggler {
    private Poem poem;

    public PoeticJuggler(Poem poem) {
	super();
	this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem) {
	super(beanBags);
	this.poem = poem;
    }

    @Override
    public void perform() throws PerformanceException {
	System.out.println("JUGGLIMG " + getBeanBags() + " BEANBAGS");
	System.out.println("While reciting...");
	poem.recite();
    }
}
