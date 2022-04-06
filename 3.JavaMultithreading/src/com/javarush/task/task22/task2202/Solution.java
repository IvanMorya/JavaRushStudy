package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        StringBuilder stringBuilder = new StringBuilder("");
        try {
            String[] words = string.split(" ");
            for (int i = 1; i < 5; i++) {
                stringBuilder.append(words[i]).append(" ");
            }
        } catch (Exception e) {
            throw new TooShortStringException();
        }
        return stringBuilder.toString().trim();
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
