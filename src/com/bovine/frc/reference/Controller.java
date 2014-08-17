package com.bovine.frc.reference;

public class Controller
{
    /*
    Buttons
     */
    public static final int A = 1;
    public static final int B = 2;
    public static final int X = 3;
    public static final int Y = 4;
    public static final int LEFT_BUMPER = 5;
    public static final int RIGHT_BUMPER = 6;
    public static final int BACK = 7;
    public static final int START = 8;
    public static final int LEFT_JOYSTICK = 9;
    public static final int RIGHT_JOYSTICK = 10;

    /*
    Axis
     */
    public static final int LEFT_X_AXIS = 1;
    public static final int LEFT_Y_AXIS = 2;
    public static final int TRIGGERS = 3;
    public static final int RIGHT_X_AXIS = 4;
    public static final int RIGHT_Y_AXIS = 5;
    public static final int DPAD_X_AXIS = 6;

    public static int getValueFromString(String value) {
        if(value.equals("A")) {
            return A;
        } else if(value.equals("B")) {
            return B;
        } else if(value.equals("X")) {
            return X;
        } else if(value.equals("Y")) {
            return Y;
        } else if(value.equals("LEFT_BUMPER")) {
            return LEFT_BUMPER;
        } else if(value.equals("RIGHT_BUMPER")) {
            return RIGHT_BUMPER;
        } else if(value.equals("BACK")) {
            return BACK;
        } else if(value.equals("START")) {
            return START;
        } else if(value.equals("LEFT_JOYSTICK")) {
            return LEFT_JOYSTICK;
        } else if(value.equals("RIGHT_JOYSTICK")) {
            return RIGHT_JOYSTICK;
        } else if(value.equals("LEFT_X_AXIS")) {
            return LEFT_X_AXIS;
        } else if(value.equals("LEFT_Y_AXIS")) {
            return LEFT_Y_AXIS;
        } else if(value.equals("TRIGGERS")) {
            return TRIGGERS;
        } else if(value.equals("RIGHT_X_AXIS")) {
            return RIGHT_X_AXIS;
        } else if(value.equals("RIGHT_Y_AXIS")) {
            return RIGHT_Y_AXIS;
        } else if(value.equals("DPAD_X_AXIS")) {
            return DPAD_X_AXIS;
        } else {
            return -1;
        }
    }
}
