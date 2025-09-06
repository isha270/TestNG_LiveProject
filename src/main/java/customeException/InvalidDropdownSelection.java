package customeException;

public class InvalidDropdownSelection extends RuntimeException{
    public InvalidDropdownSelection(String message) {
        super(message); // Calls RuntimeException's constructor
    }
}
