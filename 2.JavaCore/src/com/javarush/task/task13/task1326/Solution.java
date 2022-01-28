package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceOfReadNum = reader.readLine();
        Scanner scanner = new Scanner(new FileInputStream(sourceOfReadNum));

        List<Integer> integers = new ArrayList<>();
        while (scanner.hasNext()) {
            int value = scanner.nextInt();
            if (value % 2 == 0) {
                integers.add(value);
            }
        }

        Collections.sort(integers);
        for (Integer value : integers) {
            System.out.println(value);
        }

        scanner.close();
    }
}
