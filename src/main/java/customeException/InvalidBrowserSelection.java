package customeException;

public class InvalidBrowserSelection extends RuntimeException {
    public InvalidBrowserSelection(String message) {
        super(message);
    }
}
