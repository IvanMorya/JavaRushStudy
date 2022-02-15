package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.SecureRandom;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String identificationKey = args[0];
        String fileName = args[1];
        String fileOutputName = args[2];
        FileInputStream fileInputStream = new FileInputStream(fileName);
        FileOutputStream fileOutputStream = new FileOutputStream(fileOutputName);
        switch (identificationKey) {
            case "-e":
                while (fileInputStream.available() > 0) {
                    int currentByte = fileInputStream.read();
                    fileOutputStream.write(currentByte*2);
                }
                break;
            case "-d":
                while (fileInputStream.available() > 0) {
                    int currentByte = fileInputStream.read();
                    fileOutputStream.write(currentByte/2);
                }
                break;
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
