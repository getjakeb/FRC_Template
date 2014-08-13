package com.bovine.frc.handler;

import com.bovine.frc.reference.Reference;

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

    }

    public static void save() {

    }
}
