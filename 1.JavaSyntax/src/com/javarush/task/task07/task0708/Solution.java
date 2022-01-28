package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String mpt = "";
        for (int i = 0; i < 5; i++) {
            String a = bufferedReader.readLine();
            if (a.length() > mpt.length()) {
                mpt = a;
                strings.add(0, a);
            } else {
                strings.add(a);
            }
        }
        System.out.println(strings.get(0));
        for (int i = 1; i < strings.size(); i++) {
            if (strings.get(i).length() == strings.get(0).length()) {
                System.out.println(strings.get(i));
            }
        }
    }
}
