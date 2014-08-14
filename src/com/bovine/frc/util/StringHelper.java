package com.bovine.frc.util;

public class StringHelper
{
    public static boolean isNumeric(String text) {
        int num = 0;
        char[] chars = text.toCharArray();
        boolean digits = true;

        if(text.length() == 0) {
            return false;
        }

        for(int i = 0; i < chars.length; i++) {
            if(!Character.isDigit(chars[i])) {
                return false;
            }
        }

        return true;
    }
}
