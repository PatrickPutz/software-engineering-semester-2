package fileio.bsp4;

public class AdressExportFileAlreadyExistsException extends Exception{

    public AdressExportFileAlreadyExistsException() {
    }

    public AdressExportFileAlreadyExistsException(String message) {
        super(message);
    }

    public AdressExportFileAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public AdressExportFileAlreadyExistsException(Throwable cause) {
        super(cause);
    }

    public AdressExportFileAlreadyExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
