package com.bovine.frc.logging;

import java.util.Vector;

public class LogFactory
{
    private static Vector logs;

    public static void init() {
        logs = new Vector();
        logs.addElement(new Logger("Global", Level.ALL));
    }

    public static void createLog(String name) {
        if(!doesLogExist(name) && name.length() > 0) {
            logs.addElement(new Logger(name));
        }
    }

    public static void createLog(String name, Level level) {
        if(!doesLogExist(name) && name.length() > 0) {
            logs.addElement(new Logger(name, level));
        }
    }

    public static Logger getLog(String name) {
        Logger log;
        for(int i = 0; i < logs.size(); i++) {
            log = (Logger) logs.elementAt(i);

            if(log.getName().equals(name)) {
                return log;
            }
        }

        return null;
    }

    public static boolean doesLogExist(String name) {
        return getLog(name) != null;
    }
}