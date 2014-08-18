package com.bovine.frc.util;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.Vector;

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

    public static String format(String format, Object[] data) throws IllegalArgumentException {
        int objectsRequired = 0;
        int index = 0;
        String[] parsedFormat = parse(format);
        String out = "";

        for(String element : parsedFormat) {
            if(element.equals("%o")) {
                objectsRequired++;
            }
        }

        if(objectsRequired != data.length) {
            throw new IllegalArgumentException("Invalid number of objects");
        }

        for(String element : parsedFormat) {
            if(element.equals("%o")) {
                out += data[index].toString();
                index++;
            } else {
                out += element;
            }
        }

        return out;
    }

    private static String[] parse(String format) {
        Vector array = new Vector();
        String[] out;
        String substring = "";
        while(format.length() > 0) {
            if(format.startsWith("%o")) {
                substring = format.substring(0, 2);
        } else {
            if(format.indexOf("%o") != -1) {
                substring = format.substring(0, format.indexOf("%o"));
            } else {
                substring = format.substring(0);
            }
        }
            format = format.substring(substring.length() - 1);
            array.addElement(substring);
        }

        out = new String[array.size()];
        array.copyInto(out);

        return out;
    }

    public static String getDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DATE);

        return month + "/" + day + "/" + year;
    }

    public static String getTime(Date date) {
        String dat = date.toString();
        return dat.substring(dat.indexOf(':') - 2, dat.lastIndexOf(':') + 3);
    }
}
