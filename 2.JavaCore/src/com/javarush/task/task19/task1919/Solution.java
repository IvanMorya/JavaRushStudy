package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) {
        TreeMap<String, Double> list = new TreeMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String[] s = reader.readLine().split(" ");
                if (list.containsKey(s[0])) {
                    double currentDouble = Double.parseDouble(s[1]);
                    double value = list.get(s[0]);
                    double result = currentDouble + value;
                    list.remove(s[0]);
                    list.put(s[0], result);
                } else {
                    list.put(s[0], Double.valueOf(s[1]));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String key : list.keySet()) {
            System.out.println(key + " " + list.get(key));
        }
    }
}
