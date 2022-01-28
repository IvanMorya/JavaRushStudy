package com.javarush.task.pro.task02.task0214;

import java.util.Locale;
import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String c = scanner.nextLine();

        System.out.println(c);
        System.out.println(b.toUpperCase());
        System.out.println(a.toLowerCase());

    }
}
