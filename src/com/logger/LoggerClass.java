package com.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

// 4. Java System Logs
class LoggerClass {
    private static final Logger LOGGER = Logger.getLogger(LoggerClass.class.getName());

    public void performSomeTask() {
        // Add code to perform some task and log messages using LOGGER
        LOGGER.log(Level.INFO, "Info log message");
        LOGGER.log(Level.WARNING, "Warning log message");
        LOGGER.log(Level.SEVERE, "Severe log message");
    }
}
