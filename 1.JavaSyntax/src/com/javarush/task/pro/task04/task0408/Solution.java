package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = Integer.MIN_VALUE;
        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            if (i % 2 == 0 && i > result){
                result = i;
            }
        }
        System.out.println(result);
    }
}