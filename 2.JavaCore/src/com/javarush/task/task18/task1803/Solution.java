package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = null;
        try {
            filename = reader.readLine();
            reader.close();
            FileInputStream fileInputStream = new FileInputStream(filename);
            while (fileInputStream.available() > 0) {
                fileInputStream.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
