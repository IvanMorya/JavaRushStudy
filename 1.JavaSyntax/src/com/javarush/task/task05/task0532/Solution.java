package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int amountOfNumber = Integer.parseInt(reader.readLine());

        if (amountOfNumber <= 0){
            return;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < amountOfNumber; i++) {
            int num = Integer.parseInt(reader.readLine());
            if (num > max) {
                max = num;
            }
        }
        int maximum = max;

        System.out.println(maximum);
    }
}
