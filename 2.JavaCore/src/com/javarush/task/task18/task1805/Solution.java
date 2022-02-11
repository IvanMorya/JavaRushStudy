package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        Set<Integer> bytes = new TreeSet<>();
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while (fileInputStream.available() > 0) {
                bytes.add(fileInputStream.read());
            }
        }
        for (Integer aByte : bytes) {
            System.out.print(aByte + " ");
        }

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String fileName = null;
//        ArrayList<Integer> list = new ArrayList<>();
//        try {
//            fileName = reader.readLine();
//            reader.close();
//            FileInputStream fileInputStream = new FileInputStream(fileName);
//            while (fileInputStream.available() > 0) {
//                int currentByte = fileInputStream.read();
//                if (!list.contains(currentByte)) {
//                    list.add(currentByte);
//                }
//            }
//            fileInputStream.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        Collections.sort(list);
//        for (Integer integer : list) {
//            System.out.print(integer + " ");
//        }
    }
}
