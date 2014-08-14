package com.bovine.frc.handler;

import com.bovine.frc.config.ConfigurationRegistry;
import com.bovine.frc.reference.Controller;
import com.bovine.frc.reference.Reference;
import com.bovine.frc.util.StringHelper;

import java.util.Vector;

public class ConfigurationHandler
{
   public static void init() {
       if(FileHandler.createFile(Reference.CONFIGURATION_FILE)) {       //File does not exist
           loadDefaults();
       } else {
           loadCustom();
       }

       save();
   }

    public static void loadDefaults() {

    }

    public static void loadCustom() {
        String configurationRegistry = FileHandler.getFileContents(Reference.CONFIGURATION_FILE);
        String configuration, name, valueRaw;
        int value;
        while(configurationRegistry.length() > 0) {
            configuration = configurationRegistry.substring(0, configurationRegistry.indexOf('\n'));
            name = configuration.substring(0, configuration.indexOf(':'));
            valueRaw = configuration.substring(configuration.indexOf(':') + 2);
            if(StringHelper.isNumeric(valueRaw)) {
                value = Integer.valueOf(valueRaw);
            } else {
                //Determine which value valueRaw represents
                value = Controller.getValueFromString(valueRaw);
            }
            ConfigurationRegistry.addConfiguration(name, value);
        }
    }

    public static void save() {
        String configurationRegistry = ConfigurationRegistry.getRegistry();
        FileHandler.writeToFile(Reference.CONFIGURATION_FILE, configurationRegistry);
    }
}
