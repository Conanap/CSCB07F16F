import java.lang.Exception;
import java.lang.Throwable;

/* This exception is cooler than you
Don't necessarily need throwable, dependent upon application*/

public class CoolException extends Exception {
    public CoolException() {
        super();
    }

    public CoolException(String message) {
        super(message);
    }

    public CoolException(String message, Throwable cause) {
        super(message, cause);
    }

    public CoolException(Throwable cause) {
        super(cause);
    }
}