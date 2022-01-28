package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean end = false;
        int sum = 0;
        while (!end) {
            int a = scanner.nextInt();
            sum = sum + a;
            if (scanner.hasNext("ENTER")) {
            end = true;
            }
        }
        System.out.println(sum);
    }
}