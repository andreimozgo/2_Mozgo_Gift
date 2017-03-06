package by.mozgo.gift.exception;

/**
 * @author Andrei Mozgo
 */
public class SweetCreatorException extends Exception {
    public SweetCreatorException() {
        super();
    }

    public SweetCreatorException(String message) {
        super(message);
    }

    public SweetCreatorException(String message, Throwable cause) {
        super(message, cause);
    }

    public SweetCreatorException(Throwable cause) {
        super(cause);
    }
}
