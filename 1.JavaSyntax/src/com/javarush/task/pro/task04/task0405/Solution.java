package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int line = 0;
        while (line < 10) {
            int column = 0;
            while (column < 20) {
                if (line == 0 || line == 9 ) {
                System.out.print("Б");
                } else  if (column == 0 || column == 19) {
                    System.out.print("Б");
                } else {
                    System.out.print(" ");
                }
                column++;
            }
            System.out.println();
            line++;
        }

    }
}