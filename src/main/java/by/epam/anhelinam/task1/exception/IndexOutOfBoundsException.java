package by.epam.anhelinam.task1.exception;

public class IndexOutOfBoundsException extends Exception {
    public IndexOutOfBoundsException() {
    }

    public IndexOutOfBoundsException(String message) {
        super(message);
    }

    public IndexOutOfBoundsException(String message, Throwable cause) {
        super(message, cause);
    }

    public IndexOutOfBoundsException(Throwable cause) {
        super(cause);
    }
}
