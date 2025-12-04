package se.lexicon.exceptions.workshop.Exception.Class;

public class DuplicateNameException extends Exception {
    public DuplicateNameException() {
        super();
    }
    public DuplicateNameException(String message) {
        super(message);
    }
    public DuplicateNameException(String message, Throwable cause) {
        super(message, cause);
    }
    public DuplicateNameException(Throwable cause) {
        super(cause);
    }
}
