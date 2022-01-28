package com.javarush.task.jdk13.task06.task0624;

import java.util.Scanner;

public class SolutionTest {
    public static int[][] array = new int[3][];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        array[0] = new int[3];
        array[1] = new int[2];
        array[2] = new int[3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i +j;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
                }
            System.out.println();
        }
    }
}
