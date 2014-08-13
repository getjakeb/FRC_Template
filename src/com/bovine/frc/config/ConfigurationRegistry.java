package com.bovine.frc.config;

import java.util.Vector;

public class ConfigurationRegistry
{
    private static Vector registry;

    public static void init() {
        registry = new Vector();
    }

    public static Configuration getConfiguration(String name) {
        Configuration config;

        for(int i = 0; i < registry.size(); i++) {
            config = (Configuration) registry.get(i);

            if(config.getName().equals(name)) {
                return config;
            }
        }

        return null;
    }

    public static void addConfiguration(Configuration config) {
        if(getConfiguration(config.getName()) == null) {
            registry.add(config);
        }
    }

    public static void editConfiguation(String name, int value) {
        getConfiguration(name).setValue(value);
    }


}
