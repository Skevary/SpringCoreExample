package knights;

public class QuestException extends Exception {

    private static final long serialVersionUID = 4858817208874472106L;

    public QuestException(String message, Throwable cause) {
	super(message, cause);
    }

    public QuestException(String message) {
	super(message);
    }

    public QuestException(Throwable cause) {
	super(cause);
    }

}
