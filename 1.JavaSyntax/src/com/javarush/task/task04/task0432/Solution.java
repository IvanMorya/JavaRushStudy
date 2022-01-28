package com.javarush.task.task04.task0432;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Хорошего много не бывает
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = bufferedReader.readLine();
        int number1 = Integer.parseInt(bufferedReader.readLine());
        while (number1 > 0) {
            System.out.println(string);
            number1--;
        }
    }
}
