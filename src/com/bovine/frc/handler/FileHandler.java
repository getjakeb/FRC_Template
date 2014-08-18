package com.bovine.frc.handler;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import javax.microedition.io.Connector;

import com.bovine.frc.reference.Reference;
import com.sun.squawk.io.BufferedReader;
import com.sun.squawk.microedition.io.FileConnection;

public class FileHandler
{

    /**
     *
     * @param file --> the name of the file
     * @return true if file was created; false otherwise
     */
    public static boolean createFile(String file) {

        String url = "file:///" + file + Reference.FILE_EXTENSION;
        FileConnection fc;

        try {
            fc = (FileConnection) Connector.open(url);

            if(!fc.exists()) {
                fc.create();
                return true;
            }

            fc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    /**
     *
     * @param file --> the name of the file
     * @return contents --> the contents of the file
     */
    public static String getFileContents(String file) {
        String url = "file:///" + file;
        String contents = "";

        try {
            FileConnection fc = (FileConnection) Connector.open(url);

            BufferedReader buf = new BufferedReader(new InputStreamReader(fc.openInputStream()));
            String line = "";
            while ((line = buf.readLine()) != null) {
                contents += line + "\n";
            }

            fc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contents;
    }

    /**
     *
     * @param file --> the name of the file
     * @param contents --? the information to write to the file
     */
    public static void writeToFile(String file, String contents) {
        String url = "file:///" + file;

        try {
            FileConnection fc = (FileConnection) Connector.open(url);
            if(!fc.exists()) {
                createFile(file);
            }

            OutputStreamWriter writer = new OutputStreamWriter(fc.openOutputStream());
            writer.write(contents);

            fc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void appendToFile(String file, String message) {
        writeToFile(file, getFileContents(file) + message);
    }

    public static String getNextNumber(String fileBase)
    {
        int next = 1;
        boolean exists = true;
        String url;
        FileConnection fc;

        try {
            while(exists) {
                url = "file:///" + fileBase + next;
                fc = (FileConnection) Connector.open(url);
                if(fc.exists()) {
                    next++;
                } else {
                    exists = false;
                }
                fc.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return Integer.toString(next);
    }
}