package com.bovine.frc.util;

import com.bovine.frc.reference.Controller;

public class ConfigurationHelper
{
    public static int getValueFromString(String value) {
        if(value.equals("A")) {
            return Controller.A;
        } else if(value.equals("B")) {
            return Controller.B;
        } else if(value.equals("X")) {
            return Controller.X;
        } else if(value.equals("Y")) {
            return Controller.Y;
        } else if(value.equals("LEFT_BUMPER")) {
            return Controller.LEFT_BUMPER;
        } else if(value.equals("RIGHT_BUMPER")) {
            return Controller.RIGHT_BUMPER;
        } else if(value.equals("BACK")) {
            return Controller.BACK;
        } else if(value.equals("START")) {
            return Controller.START;
        } else if(value.equals("LEFT_JOYSTICK")) {
            return Controller.LEFT_JOYSTICK;
        } else if(value.equals("RIGHT_JOYSTICK")) {
            return Controller.RIGHT_JOYSTICK;
        } else if(value.equals("LEFT_X_AXIS")) {
            return Controller.LEFT_X_AXIS;
        } else if(value.equals("LEFT_Y_AXIS")) {
            return Controller.LEFT_Y_AXIS;
        } else if(value.equals("TRIGGERS")) {
            return Controller.TRIGGERS;
        } else if(value.equals("RIGHT_X_AXIS")) {
            return Controller.RIGHT_X_AXIS;
        } else if(value.equals("RIGHT_Y_AXIS")) {
            return Controller.RIGHT_Y_AXIS;
        } else if(value.equals("DPAD_X_AXIS")) {
            return Controller.DPAD_X_AXIS;
        } else {
            return -1;
        }
    }
}
