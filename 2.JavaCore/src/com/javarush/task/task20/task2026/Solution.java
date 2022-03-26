package com.javarush.task.task20.task2026;

/* 
Алгоритмы-прямоугольники
*/

public class Solution {
    public static void main(String[] args) {
        int i = -0B10001010;
        System.out.println(i);
        String s = Integer.toBinaryString(138);
        System.out.println(s);

        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

//        int count1 = getRectangleCount(a1);
//        System.out.println("count = " + count1 + ". Должно быть 2");
//        int count2 = getRectangleCount(a2);
//        System.out.println("count = " + count2 + ". Должно быть 4");
    }

    public static int getRectangleCount(byte[][] a) {
        return 0;
    }
}
