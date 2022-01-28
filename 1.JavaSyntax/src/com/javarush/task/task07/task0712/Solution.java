package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String string = reader.readLine();
            strings.add(string);
        }

        String maxStr = "";
        int indexMaxStr = 0;
        String minStr = "                                      ";
        int indexMinStr = 0;
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > maxStr.length()) {
                maxStr = strings.get(i);
                indexMaxStr = i;
            }
            if (strings.get(i).length() < minStr.length()){
                minStr = strings.get(i);
                indexMinStr = i;
            }
        }
        if (indexMaxStr < indexMinStr) {
            System.out.println(strings.get(indexMaxStr));
        } else {
            System.out.println(strings.get(indexMinStr));
        }
    }
}
