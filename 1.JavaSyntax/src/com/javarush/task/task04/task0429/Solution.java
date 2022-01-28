package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(bufferedReader.readLine());
        int number2 = Integer.parseInt(bufferedReader.readLine());
        int number3 = Integer.parseInt(bufferedReader.readLine());
        int countPositiveNumber = 0;
        int countNegativeNumber = 0;
        if (number1 > 0) {
            countPositiveNumber++;
        } else if (number1 < 0) {
            countNegativeNumber++;
        }
        if (number2 > 0) {
            countPositiveNumber++;
        } else if (number2 < 0) {
            countNegativeNumber++;
        }
        if (number3 > 0) {
            countPositiveNumber++;
        } else if (number3 < 0) {
            countNegativeNumber++;
        }
        System.out.println("количество отрицательных чисел: " + countNegativeNumber);
        System.out.println("количество положительных чисел: " + countPositiveNumber);
    }
}
