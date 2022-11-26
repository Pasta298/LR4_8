package main.utilities;

import org.apache.log4j.Logger;

public class LoggerUtils {

    public static void logInfo(Class<?> clazz, String message) {
        Logger.getLogger(clazz).info(message);
    }

    public static void logFatal(String message) {
        Logger.getLogger(LoggerUtils.class).fatal(message);
    }
}
