package org.lab11.logger;

import java.time.LocalDateTime;

class Logger {
    private static Logger instance;

    private Logger() { }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        logMessage("LOG", message);
    }

    public void logInfo(String message) {
        logMessage("Information", message);
    }

    public void logWarning(String message) {
        logMessage("Warning!!", message);
    }

    public void logError(String message) {
        logMessage("Error found!", message);
    }

    private void logMessage(String severity, String message) {
        LocalDateTime time = LocalDateTime.now();
        String fmessage = String.format("[%s] %s - %s", time, severity, message);
        System.out.println(fmessage);
    }
}

class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Application start.");
        logger.logInfo("Informational message.");
        logger.logWarning("Warning message.");
        logger.logError("Error occurred!");

        Logger anotherLogger = Logger.getInstance();
        anotherLogger.log("Logging from somewhere else.");
    }
}

