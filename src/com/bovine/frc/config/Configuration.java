package com.bovine.frc.config;

public class Configuration
{
    private String name;
    private int value;



    public Configuration() {
        name = "default";
        value = 0;
    }

    public Configuration(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public Configuration(Configuration config) {
        this.name = config.getName();
        this.value = config.getValue();
    }

    public String getName() {
        return name;
    }
    public int getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString() {
        return this.name + ": " + this.value;
    }
}
