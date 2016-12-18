package springshow;

public class PerformanceException extends Exception {

    private static final long serialVersionUID = 278048085661443141L;

    public PerformanceException(String message, Throwable cause) {
	super(message, cause);
    }

    public PerformanceException(String message) {
	super(message);
    }

    public PerformanceException(Throwable cause) {
	super(cause);
    }
}
