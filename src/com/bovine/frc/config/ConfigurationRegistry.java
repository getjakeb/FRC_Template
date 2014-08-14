package com.bovine.frc.config;

import com.bovine.frc.handler.ConfigurationHandler;

import java.util.Vector;

public class ConfigurationRegistry
{
    private static Vector registry;

    public static void init() {
        registry = new Vector();
        ConfigurationHandler.init();
    }

    public static Configuration getConfiguration(String name) {
        Configuration config;

        for(int i = 0; i < registry.size(); i++) {
            config = (Configuration) registry.get(i);

            if(config.getName().equals(name)) {
                return new Configuration(config);
            }
        }

        return null;
    }

    public static boolean addConfiguration(Configuration config) {
        if(!doesConfigurationExist(config.getName())) {
            registry.add(new Configuration(config));
            return true;
        }

        return false;
    }

    public static boolean addConfiguration(String name, int value) {
        if(!doesConfigurationExist(name)) {
            registry.add(new Configuration(name, value));
            return true;
        }

        return false;
    }

    public static boolean editConfiguation(String name, int value) {
        if(doesConfigurationExist(name)) {
            getConfiguration(name).setValue(value);
            return true;
        }
        return false;
    }

    public static boolean doesConfigurationExist(String name) {
        return getConfiguration(name) == null;
    }

    public static String getRegistry() {
        String out = "";

        for(int i = 0; i < registry.size(); i++) {
            out += registry.get(i).toString() + "\n";
        }

        return out;
    }
}
