package fileio.bsp4;

public class AddressLoadWrongFormatException extends  Exception{

    public AddressLoadWrongFormatException() {
    }

    public AddressLoadWrongFormatException(String message) {
        super(message);
    }

    public AddressLoadWrongFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public AddressLoadWrongFormatException(Throwable cause) {
        super(cause);
    }

    public AddressLoadWrongFormatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
