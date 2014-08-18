package com.bovine.frc.util;

import com.bovine.frc.logging.Level;
import com.bovine.frc.logging.Logger;

public class LogHelper
{
    private static Logger logger;

    public static void init() {
        logger = new Logger("General", Level.ALL);
    }

    private static void log(String className, Level logLevel, Object object)
    {
        logger.log(logLevel, className, String.valueOf(object));
    }

    public static void info(Object object)
    {
        log("Global", Level.INFO, object);
    }

    public static void info(Class c, Object object)
    {
        log(c.getName(), Level.INFO, object);
    }

    public static void trace(Object object)
    {
        log("Global", Level.TRACE, object);
    }

    public static void trace(Class c, Object object)
    {
        log(c.getName(), Level.TRACE, object);
    }

    public static void debug(Object object)
    {
        log("Global", Level.DEBUG, object);
    }

    public static void debug(Class c, Object object)
    {
        log(c.getName(), Level.DEBUG, object);
    }

    public static void error(Object object)
    {
        log("Global", Level.ERROR, object);
    }

    public static void error(Class c, Object object)
    {
        log(c.getName(), Level.ERROR, object);
    }

    public static void warn(Object object)
    {
        log("Global", Level.WARN, object);
    }

    public static void warn(Class c, Object object)
    {
        log(c.getName(), Level.WARN, object);
    }

    public static void fatal(Object object)
    {
        log("Global", Level.FATAL, object);
    }

    public static void fatal(Class c, Object object)
    {
        log(c.getName(), Level.FATAL, object);
    }
}
