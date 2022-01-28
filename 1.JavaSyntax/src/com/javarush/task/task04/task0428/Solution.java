package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(bufferedReader.readLine());
        int number2 = Integer.parseInt(bufferedReader.readLine());
        int number3 = Integer.parseInt(bufferedReader.readLine());
        if (number1 > 0 && number2 > 0 && number3 > 0){
            System.out.println(3);
        } else if (number1 > 0 && number2 > 0 || number1 > 0 && number3 > 0 || number2 > 0 && number3 > 0) {
            System.out.println(2);
        } else if (number1 > 0 || number2 > 0 || number3 > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
