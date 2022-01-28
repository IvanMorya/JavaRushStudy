package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(bufferedReader.readLine());
        if (number > 0) {
            if (number % 2 == 0 && number < 10) {
                System.out.println("четное однозначное число");
            } else if (number % 2 != 0 && number < 10) {
                System.out.println("нечетное однозначное число");
            } else if (number % 2 == 0 && number < 100) {
                System.out.println("четное двузначное число");
            } else if (number % 2 != 0 && number < 100) {
                System.out.println("нечетное двузначное число");
            } else if (number % 2 == 0 && number < 1000) {
                System.out.println("четное трехзначное число");
            } else if (number % 2 != 0 && number < 1000) {
                System.out.println("нечетное трехзначное число");
            }
        }
    }
}
