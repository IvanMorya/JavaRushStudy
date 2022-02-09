package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        ArrayList<Integer> listBytes = new ArrayList<>();
        while (fileInputStream.available() > 0) {
            listBytes.add(fileInputStream.read());
        }
        fileInputStream.close();
        Map<Integer, Integer> objectObjectMap = new HashMap<>();
        for (Integer intByte : listBytes) {
            int currentByte = intByte;
            int countByte = 0;
            for (Integer integer : listBytes) {
                if (currentByte == integer) {
                    countByte++;
                }
            }
            objectObjectMap.put(currentByte, countByte);
        }
        for (Map.Entry<Integer, Integer> entry : objectObjectMap.entrySet()) {
            if (entry.getValue() < 2) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
