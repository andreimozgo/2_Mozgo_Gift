package by.mozgo.gift.exception;

/**
 * @author Andrei Mozgo
 */
public class SweetReaderException extends Exception {
    public SweetReaderException() {
        super();
    }

    public SweetReaderException(String message) {
        super(message);
    }

    public SweetReaderException(String message, Throwable cause) {
        super(message, cause);
    }

    public SweetReaderException(Throwable cause) {
        super(cause);
    }
}
