package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        if (a.equals(b)) {
        System.out.println("строки одинаковые");
        } else {
        //напишите тут ваш код
        System.out.println("строки разные");
        }
    }
}
