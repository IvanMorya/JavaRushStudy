package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double average = 0;
        int count = 0;
        while (true) {
            int a = Integer.parseInt(bufferedReader.readLine());

            if (a == -1) {
                System.out.println(average / count);
                break;
            } else {
                average += a;
                count++;
            }
        }
    }
}

