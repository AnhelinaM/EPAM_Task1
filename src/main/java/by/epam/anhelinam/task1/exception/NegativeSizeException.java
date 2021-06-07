package by.epam.anhelinam.task1.exception;

public class NegativeSizeException extends Exception {
    public NegativeSizeException() {
    }

    public NegativeSizeException(String message) {
        super(message);
    }

    public NegativeSizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeSizeException(Throwable cause) {
        super(cause);
    }
}
