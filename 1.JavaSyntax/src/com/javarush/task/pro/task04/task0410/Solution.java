package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // создаю переменну для хранения второго по величине числа
        int preMin = Integer.MAX_VALUE;
        // здесь переменная для хранения минимального числа
        int lastMin = Integer.MAX_VALUE;
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            // проверяю не равно ли очередное полученное число (когда числа уже в переменных) уже существующим
            // в случае если равно, то пропускаем это число чтобы оно не попало вместо второго по величине числа
            if (a == lastMin || a == preMin) {
                continue;
            }
            // в случае выполения условия сохраняем число как самое маленькое а то что было сохраняем как второе по величине
            if (a < lastMin) {
                preMin = lastMin;
                lastMin = a;
                // если число было больше чем минимальное то проверяем не меньше ли оно второго по величине, если меньше то сохраняем
            } else if (a < preMin){
                preMin = a;
            }
        }
        System.out.println(preMin);
    }
}