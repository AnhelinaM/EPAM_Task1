package by.epam.anhelinam.task1.exception;

public class CannotReadFileException extends Exception {
    public CannotReadFileException() {
    }

    public CannotReadFileException(String message) {
        super(message);
    }

    public CannotReadFileException(String message, Throwable cause) {
        super(message, cause);
    }

    public CannotReadFileException(Throwable cause) {
        super(cause);
    }
}
