package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        int[] ints1 = {1, 2, 3, 4, 5};
        int[] ints2 = {1, 2};
        int[] ints3 = {1, 2, 3, 4};
        int[] ints4 = {1, 2, 3, 4, 5, 6, 7};
        int[] ints5 = {};
        list.add(ints1);
        list.add(ints2);
        list.add(ints3);
        list.add(ints4);
        list.add(ints5);
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
