package springIdol;

public class PoeticJuggler extends Juggler {
	Poem poem;

	public PoeticJuggler(Poem poem) {
		super();
		this.poem = poem;
	}

	public PoeticJuggler(int beanBags, Poem poem) {
		super(beanBags);
		this.poem = poem;
	}

	@Override
	public void perform() throws PerformanceException{
		super.perform();
		System.out.println("\n While reciting...");
		poem.recite();
	}
}
