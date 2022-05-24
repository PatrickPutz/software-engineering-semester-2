package fileio.bsp5;

public class ErrorMessage {

    private String errorLevel;
    private String errorMessage;
    private String errorTime;

    public ErrorMessage(ErrorLevelType errorLevelType, String errorMessage, String errorTime) {
        switch (errorLevelType){
            case FATAL:
                this.errorLevel = "FATAL";
                break;
            case ERROR:
                this.errorLevel = "ERROR";
                break;
            case INFO:
                this.errorLevel = "INFO";
                break;
            case DEBUG:
                this.errorLevel = "DEBUG";
                break;
        }
        this.errorMessage = errorMessage;
        this.errorTime = errorTime;
    }

    public String toLine(){
        return (errorTime + ": " + errorLevel + " - " + errorMessage);
    }

    public String getErrorLevel() {
        return errorLevel;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getErrorTime() {
        return errorTime;
    }
}
