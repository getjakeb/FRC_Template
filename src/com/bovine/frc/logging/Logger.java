package com.bovine.frc.logging;

import com.bovine.frc.handler.FileHandler;
import com.bovine.frc.reference.Reference;
import com.bovine.frc.util.StringHelper;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Watchdog;

import java.util.Date;

public class Logger
{
    private String name;
    private String file;
    private Level level;

    public Logger() {
        this("Global", Level.DEBUG);
    }

    public Logger(String name) {
        this(name, Level.DEBUG);
    }

    public Logger(String nam, Level minimumLevel) {
        this.name = nam.toUpperCase();
        this.level = minimumLevel;
    }

    public String getName() {
        return this.name;
    }

    public void setMinimumLogLevel(Level minimumLevel) {
        level = minimumLevel;
    }

    public boolean isEnabled(Level level) {
        return level.isAtLeastAsSpecificAs(level);
    }

    /*
     * Log format:      [hh:mm:ss] [loggerName/Level] [className]: message
     */

    public void log(Level level, String className, String message) {
        if(level == Level.FATAL) {
            Watchdog.getInstance().kill();
        }

        Date current = new Date(System.currentTimeMillis());
        String time = StringHelper.getTime(current);

        String log = "[" + time + "] [" + this.name + "/" + level.name() + "] [" + className + "]: " + message;

        System.out.println(log);
        FileHandler.appendToFile(file, "\n" + log);
    }

    public void log(Level level, String className, String format, Object... data) {
        log(level, className, StringHelper.format(format, data));
    }

    public void log(Level level, String message) {
        log(level, "Unknown", message);
    }

    public void log(Level level, String format, Object... data) {
        log(level, "Unknown", StringHelper.format(format, data));
    }

    private void createFile() {
        this.file = this.name + "-" + FileHandler.getNextNumber(this.name);
        FileHandler.createFile(this.file);
    }

}
