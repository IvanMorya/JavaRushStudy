package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        while (true) {
            int num = Integer.parseInt(bufferedReader.readLine());
            sum += num;

            if (num == -1) {
                break;
            }
        }
        System.out.println(sum);
    }
}
