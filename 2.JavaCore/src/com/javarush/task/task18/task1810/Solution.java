package com.javarush.task.task18.task1810;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                String fileName = reader.readLine();
                FileInputStream fileInputStream = new FileInputStream(fileName);
                if (fileInputStream.available() < 1000) {
                    reader.close();
                    fileInputStream.close();
                    throw new DownloadException();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
