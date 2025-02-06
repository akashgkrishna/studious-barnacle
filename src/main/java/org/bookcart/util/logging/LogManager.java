package org.bookcart.util.logging;

public class LogManager {

    private LogManager() {
    } // Prevent instantiation

    public static CustomLogger getLogger(Class<?> clazz) {
        return new CustomLogger(clazz);  // Now returns CustomLogger
    }
}

