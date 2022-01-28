package com.javarush.task.jdk13.task06.task0632;

public class TestArray {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {0, 0, 0, 0, 0,},
                {1, 1, 1, 1, 1,},
                {2, 2, 2, 2, 2,},
                {3, 3, 3, 3, 3,}
        };

        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }

    }
}
