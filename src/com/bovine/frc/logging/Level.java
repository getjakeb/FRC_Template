package com.bovine.frc.logging;

public enum Level
{
    OFF(0, "OFF"),
    FATAL(1, "FATAL"),
    ERROR(2, "ERROR"),
    WARN(3, "WARN"),
    INFO(4, "INFO"),
    CONFIG(5, "CONFIG"),
    DEBUG(6, "DEBUG"),
    TRACE(7, "TRACE"),
    ALL(Integer.MAX_VALUE, "ALL");

    private final int value;
    private final String name;

    private Level(final int val, final String nam) {
        value = val;
        name = nam;
    }

    public static Level toLevel(final String name) {
        return toLevel(name, DEBUG);
    }

    public static Level toLevel(final String name, final Level defaultLevel) {
        if(name == null) {
            return defaultLevel;
        }

        final String cleanLevel = name.toUpperCase();
        for(final Level level : values()) {
            if(level.name.equals(cleanLevel)) {
                return level;
            }
        }

        return defaultLevel;
    }

    public boolean isAtLeastAsSpecificAs(Level level) {
        return value <= level.value();
    }

    public boolean isAtLeastAsSpecificAs(int level) {
        return value <= level;
    }

    public int value() {
        return this.value;
    }

    public String name() {
        return this.name;
    }
}
