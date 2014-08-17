package com.bovine.frc.logging;

public enum Level
{
    INFO, TRACE, DEBUG, ERROR, WARNING, SEVERE, FATAL;

    public static String toString(Level level) {
        switch(level) {             //No need for breaks because they are unreachable
            case INFO:
                return "INFO";
            case TRACE:
                return "TRACE";
            case DEBUG:
                return "DEBIG";
            case ERROR:
                return "ERROR";
            case WARNING:
                return "WARNING";
            case SEVERE:
                return "SEVERE";
            case FATAL:
                return "FATAL";
            default:
                return "INVALID";
        }
    }
}
