package com.javarush.task.task19.task1911;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Ридер обертка
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        // Сохраняем default Stream
        PrintStream defaultStream = System.out;
        // Создаем динамический массив
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        // Создаем адаптер к классу PrintStream
        PrintStream printStream = new PrintStream(stream);
        // Устанавливаем как текущий PrintStream
        System.setOut(printStream);
        // Вызываем метод чьи данные хотим изменить
        testString.printSomething();
        // Сохраняем данные из stream
        String s = stream.toString();
        // Возвращаем управление System.out
        System.setOut(defaultStream);
        System.out.println(s.toUpperCase());

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
