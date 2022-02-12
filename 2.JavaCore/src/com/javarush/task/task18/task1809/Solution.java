package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = reader.readLine();
        String outputFile = reader.readLine();

        try (FileInputStream fileInputStream = new FileInputStream(inputFile);
             FileOutputStream fileOutputStream = new FileOutputStream(outputFile)) {

            List<Integer> inputBytes = new ArrayList<>();
            while (fileInputStream.available() > 0) {
                inputBytes.add(fileInputStream.read());
            }
            Collections.reverse(inputBytes);
            for (Integer aByte : inputBytes) {
                fileOutputStream.write(aByte);
            }
        }
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String fileName1 = null;
//        String fileName2 = null;
//
//        try {
//            fileName1 = reader.readLine();
//            fileName2 = reader.readLine();
//            reader.close();
//            FileInputStream fileInputStream = new FileInputStream(fileName1);
//            FileOutputStream fileOutputStream = new FileOutputStream(fileName2);
//            int[] buff = new int[fileInputStream.available()];
//            int countByte = 0;
//            while (fileInputStream.available() > 0) {
//                int currentByte = fileInputStream.read();
//                buff[countByte] = currentByte;
//                countByte++;
//            }
//            fileInputStream.close();
//            for (int i = buff.length - 1; i >= 0 ; i--) {
//                fileOutputStream.write(buff[i]);
//            }
//            fileOutputStream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
