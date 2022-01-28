package com.javarush.task.pro.task04.task0404;

/* 
Заполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int line = 0;
        while (line < 5) {
            int column = 0;
            while (column < 10) {
                System.out.print("Q");
                column++;
            }
            System.out.println();
            line++;
        }

    }
}