package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* 
Составить цепочку слов
*/

public class Solution {
    public static void main(String[] args) {
        //...
        try (BufferedReader readerFromUser = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader readerFromFile = new BufferedReader(new FileReader(readerFromUser.readLine()))) {

        } catch (IOException e) {
            e.printStackTrace();
        }
        StringBuilder result = getLine();
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder stringBuilder = new StringBuilder();

        return stringBuilder;
    }
}
