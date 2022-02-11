package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String fileName = reader.readLine();
//
//        int[] byteCountArray = new int[256];
//        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
//            while (fileInputStream.available() > 0) {
//                byteCountArray[fileInputStream.read()] += 1;
//            }
//        }
//        int maxCount = 0;
//        for (int byteCount : byteCountArray) {
//            if (byteCount > maxCount) maxCount = byteCount;
//        }
//        ArrayList<Integer> resultList = new ArrayList<>();
//        for (int i = 0; i < byteCountArray.length; i++) {
//            if (byteCountArray[i] == maxCount) resultList.add(i);
//        }
//        for (Integer resultItem : resultList) System.out.print(resultItem + " ");



        String filename = null;
        ArrayList<Integer> listByte = new ArrayList<>(Collections.nCopies(256, 0));
        try {
            filename = reader.readLine();
            reader.close();
            FileInputStream fileInputStream = new FileInputStream(filename);
            while (fileInputStream.available() > 0) {
                int currentByte = fileInputStream.read();
                int countByte = listByte.get(currentByte - 1);
                listByte.set(currentByte - 1, ++countByte);
            }
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        int frequentByte = 0;
        for (Integer integer : listByte) {
            if (integer > frequentByte) {
                frequentByte = integer;
            }
        }
        for (int i = 0; i < listByte.size(); i++) {
            if (listByte.get(i) == frequentByte) {
                System.out.print((i + 1) + " ");
            }
        }
    }
}
