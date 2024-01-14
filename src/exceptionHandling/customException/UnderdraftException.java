package exceptionHandling.customException;

public class UnderdraftException extends Exception {

    public UnderdraftException(String message) {
        super(message);
    }

    public UnderdraftException(Throwable cause) {
        super(cause);
    }

    public UnderdraftException(String message, Throwable cause) {
        super(message, cause);
    }
}
