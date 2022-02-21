package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        // Сохраняем дефолтный стрим
        PrintStream defaultStream = System.out;
        // Динамический стрим
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        // Создаем адаптер к классу Stream
        PrintStream printStream = new PrintStream(stream);
        // Сохраняем новый стрим в out
        System.setOut(printStream);
        testString.printSomething();
        String s = stream.toString();
        System.setOut(defaultStream);
        String[] result = s.split(" ");
        switch (result[1]) {
            case "+":
                testString.printSomething();
                System.out.println(Integer.parseInt(result[0]) + Integer.parseInt(result[2]));
                break;
            case "-":
                testString.printSomething();
                System.out.println(Integer.parseInt(result[0]) - Integer.parseInt(result[2]));
                break;
            case "*":
                testString.printSomething();
                System.out.println(Integer.parseInt(result[0]) * Integer.parseInt(result[2]));
                break;
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

