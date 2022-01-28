package com.javarush.task.pro.task04.task0415;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Площадь круга
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        if (r > 0) {
            int s = (int) Math.floor(3.14 * r * r);
            System.out.println(s);
        }
    }
}