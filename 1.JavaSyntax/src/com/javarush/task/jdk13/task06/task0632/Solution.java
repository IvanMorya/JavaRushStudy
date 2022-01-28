package com.javarush.task.jdk13.task06.task0632;

import java.util.Scanner;

/* 
Пирамида
*/

public class Solution {
    public static char[][] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        array = new char[height][2 * height - 1];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j + i < (array[i].length - 1) / 2 || j - i > (array[i].length - 1) / 2) {
                    array[i][j] = ' ';
                } else {
                    array[i][j] = '#';
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
