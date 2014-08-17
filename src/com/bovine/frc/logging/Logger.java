package com.bovine.frc.logging;

import com.bovine.frc.handler.FileHandler;
import com.bovine.frc.reference.Reference;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Watchdog;

public class Logger
{
    private static String name;
    private static Timer timer;
    private static String log;
    private static String file;

    public static void init(String nameIn) {
        name = nameIn;
        log = "";
        timer = new Timer();
        timer.reset();
        timer.start();
        file = name + "_" + Reference.LOG_FILE;
        FileHandler.createFile(file);

    }

    public static void log(Level level, String className, String message) {
        if(level == Level.FATAL) {
            Watchdog.getInstance().kill();
        }

        String log = timer.get() + " [" + className + " : " + Level.toString(level) + "] \t" + message;

        System.out.println(log);
        FileHandler.appendToFile(file, "\n" + log);


    }
}
