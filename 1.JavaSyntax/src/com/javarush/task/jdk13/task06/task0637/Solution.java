package com.javarush.task.jdk13.task06.task0637;

import java.util.Arrays;

/* 
Прямоугольник
*/

public class Solution {
    public static char[][] array = new char[5][6];

    public static void main(String[] args) {
        Arrays.fill(array[1], ' ');
        Arrays.fill(array[2], ' ');
        Arrays.fill(array[3], ' ');
        Arrays.fill(array[0], 'X');
        Arrays.fill(array[4], 'X');
        array[1][0] = 'X';
        array[2][0] = 'X';
        array[3][0] = 'X';
        array[1][5] = 'X';
        array[2][5] = 'X';
        array[3][5] = 'X';

    }
}
