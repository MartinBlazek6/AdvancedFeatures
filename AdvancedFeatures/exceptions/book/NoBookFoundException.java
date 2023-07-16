package exceptions.book;

public class NoBookFoundException extends Exception {
    public NoBookFoundException(String message) {
        super(message);
    }
}
