package com.javarush.task.jdk13.task06.task0625;

import java.util.Scanner;

/* 
Минимальная сумма
*/

public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int minSum = Integer.MAX_VALUE;

        //сумма по строкам
        for (int i = 0; i < array.length; i++) {
            int sumColumn = 0;
            int sumString = 0;
            for (int j = 0; j < array[i].length; j++) {
                sumColumn = array[j][i] + sumColumn;
                sumString = array[i][j] + sumString;
                if (j == array[i].length - 1) {
                    if (sumString < minSum) {
                        minSum = sumString;
                    }
                    if (sumColumn < minSum) {
                        minSum = sumColumn;
                    }
                }
            }
        }

        System.out.println(minSum);
    }
}
