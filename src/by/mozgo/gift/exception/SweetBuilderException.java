package by.mozgo.gift.exception;

/**
 * @author Andrei Mozgo
 */
public class SweetBuilderException extends Exception {
    public SweetBuilderException() {
        super();
    }

    public SweetBuilderException(String message) {
        super(message);
    }

    public SweetBuilderException(String message, Throwable cause) {
        super(message, cause);
    }

    public SweetBuilderException(Throwable cause) {
        super(cause);
    }
}
