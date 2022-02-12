package com.javarush.task.task18.task1808;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = null;
        String file2 = null;
        String file3 = null;
        try {
            file1 = reader.readLine();
            file2 = reader.readLine();
            file3 = reader.readLine();
            reader.close();
            FileInputStream fileInputStream = new FileInputStream(file1);
            FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
            FileOutputStream fileOutputStream3 = new FileOutputStream(file3);
            int sizeBuffFile1 = fileInputStream.available();
            byte[] buffFile1 = new byte[sizeBuffFile1];
//            byte[] buffFile2 = new byte[(int) Math.ceil(sizeBuffFile1/2.0)];
//            byte[] buffFile3 = new byte[sizeBuffFile1/2];
            while (fileInputStream.available() > 0) {
                fileInputStream.read(buffFile1);
                fileOutputStream2.write(buffFile1, 0, (int) Math.ceil(sizeBuffFile1/2.0));
                fileOutputStream3.write(buffFile1, (int) Math.ceil(sizeBuffFile1/2.0), sizeBuffFile1/2);
            }
            fileInputStream.close();
            fileOutputStream2.close();
            fileOutputStream3.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
