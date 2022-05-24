package fileio.bsp4;

public class AddressLoadException extends Exception {

    public AddressLoadException() {
    }

    public AddressLoadException(String message) {
        super(message);
    }

    public AddressLoadException(String message, Throwable cause) {
        super(message, cause);
    }

    public AddressLoadException(Throwable cause) {
        super(cause);
    }

    public AddressLoadException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
