package com.bovine.frc.util;

import com.bovine.frc.logging.Level;
import com.bovine.frc.logging.Logger;

public class LogHelper
{
    private static Logger defaultLogger;

    public static void init() {
        defaultLogger = new Logger("General", Level.ALL);
    }

    private static void log(Logger logger, String className, Level logLevel, Object object)
    {
        logger.log(logLevel, className, String.valueOf(object));
    }

    public static void info(Object object)
    {
        log(defaultLogger, "Global", Level.INFO, object);
    }

    public static void info(Class c, Object object)
    {
        log(defaultLogger, c.getName(), Level.INFO, object);
    }

    public static void info(Logger logger, Object object)
    {
        log(logger, "Global", Level.INFO, object);
    }

    public static void info(Logger logger, Class c, Object object)
    {
        log(logger, c.getName(), Level.INFO, object);
    }

    public static void trace(Object object)
    {
        log(defaultLogger, "Unknown", Level.TRACE, object);
    }

    public static void trace(Class c, Object object)
    {
        log(defaultLogger, c.getName(), Level.TRACE, object);
    }

    public static void trace(Logger logger, Object object)
    {
        log(logger, "Unknown", Level.TRACE, object);
    }

    public static void trace(Logger logger, Class c, Object object)
    {
        log(logger, c.getName(), Level.TRACE, object);
    }

    public static void debug(Object object)
    {
        log(defaultLogger, "Unknown", Level.DEBUG, object);
    }

    public static void debug(Class c, Object object)
    {
        log(defaultLogger, c.getName(), Level.DEBUG, object);
    }

    public static void debug(Logger logger, Object object)
    {
        log(logger, "Unknown", Level.DEBUG, object);
    }

    public static void debug(Logger logger, Class c, Object object)
    {
        log(logger, c.getName(), Level.DEBUG, object);
    }

    public static void error(Object object)
    {
        log(defaultLogger, "Unknown", Level.ERROR, object);
    }

    public static void error(Class c, Object object)
    {
        log(defaultLogger, c.getName(), Level.ERROR, object);
    }

    public static void error(Logger logger, Object object)
    {
        log(logger, "Unknown", Level.ERROR, object);
    }

    public static void error(Logger logger, Class c, Object object)
    {
        log(logger, c.getName(), Level.ERROR, object);
    }

    public static void warn(Object object)
    {
        log(defaultLogger, "Unknown", Level.WARN, object);
    }

    public static void warn(Class c, Object object)
    {
        log(defaultLogger, c.getName(), Level.WARN, object);
    }

    public static void warn(Logger logger, Object object)
    {
        log(logger, "Unknown", Level.WARN, object);
    }

    public static void warn(Logger logger, Class c, Object object)
    {
        log(logger, c.getName(), Level.WARN, object);
    }

    public static void fatal(Object object)
    {
        log(defaultLogger, "Unknown", Level.FATAL, object);
    }

    public static void fatal(Class c, Object object)
    {
        log(defaultLogger, c.getName(), Level.FATAL, object);
    }

    public static void fatal(Logger logger, Object object)
    {
        log(logger, "Unknown", Level.FATAL, object);
    }

    public static void fatal(Logger logger, Class c, Object object)
    {
        log(logger, c.getName(), Level.FATAL, object);
    }
}
