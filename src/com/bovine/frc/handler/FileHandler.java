package com.bovine.frc.handler;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Vector;

import javax.microedition.io.Connector;

import com.sun.squawk.io.BufferedReader;
import com.sun.squawk.microedition.io.FileConnection;


public class FileHandler
{

    /**
     *
     * @param filename --> the name of the file
     * @return true if file was created; false otherwise
     */
    public static boolean createFile(String filename) {
        String url = "file:///" + filename;
        FileConnection fc;

        try {
            fc = (FileConnection) Connector.open(url);

            if(!fc.exists()) {
                fc.create();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    /**
     *
     * @param filename --> the name of the file
     * @return contents --> the contents of the file
     */
    public static String getFileContents(String filename) {
        String url = "file:///" + filename;
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
     * @param filename --> the name of the file
     * @param contents --? the information to write to the file
     */
    public static void writeToFile(String filename, String contents) {
        String url = "file:///" + filename;

        try {
            FileConnection fc = (FileConnection) Connector.open(url);
            if(!fc.exists()) {
                createFile(filename);
            }

            OutputStreamWriter writer = new OutputStreamWriter(fc.openOutputStream());
            writer.write(contents);

            fc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}