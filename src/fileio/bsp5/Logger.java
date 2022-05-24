package fileio.bsp5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logger {

    private String path;

    public Logger(String path) {
        this.path = path;
    }

    private void logMessage(ErrorMessage message){

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(this.path, true))){

            bw.write(message.toLine());
            bw.newLine();
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void logFatal(String message){

        ErrorMessage error = new ErrorMessage(ErrorLevelType.FATAL, message, new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime()));
        this.logMessage(error);

    }

    public void logError(String message){

        ErrorMessage error = new ErrorMessage(ErrorLevelType.ERROR, message, new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime()));
        this.logMessage(error);

    }

    public void logInfo(String message){

        ErrorMessage error = new ErrorMessage(ErrorLevelType.INFO, message, new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime()));
        this.logMessage(error);

    }

    public void logDebug(String message){

        ErrorMessage error = new ErrorMessage(ErrorLevelType.DEBUG, message, new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime()));
        this.logMessage(error);

    }

}
