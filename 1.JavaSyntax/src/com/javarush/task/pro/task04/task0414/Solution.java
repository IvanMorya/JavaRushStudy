package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int number = scanner.nextInt();

        do {
            System.out.println(word);
            if (number <= 0 || number >= 5) {
                break;
            }
            number--;
        }
        while (number > 0);
    }
}