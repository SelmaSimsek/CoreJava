package p22_Exceptions;

public class InvalidNumberException extends RuntimeException {

    public InvalidNumberException(String message) {
        super(message);
    }

}
