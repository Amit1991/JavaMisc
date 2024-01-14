package exceptionHandling.customException;

public class OverdraftException extends RuntimeException {

    public OverdraftException(String message) {
        super(message);
    }

    public OverdraftException(Throwable cause) {
        super(cause);
    }

    public OverdraftException(String message, Throwable cause) {
        super(message, cause);
    }
}
