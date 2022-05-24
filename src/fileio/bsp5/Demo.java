package fileio.bsp5;

public class Demo {

    public static void main(String[] args) {

        Logger logger = new Logger("C:\\Studium\\temp\\logs.txt");

        logger.logDebug("DEBUGGING WHOOP WHOOP");
        logger.logFatal("DAMN THAT WENT WRONG");
        logger.logInfo("EXPECTING ANY USEFUL INFO? HEHE");
        logger.logError("SEEN BETTER DAYS?");

    }

}
