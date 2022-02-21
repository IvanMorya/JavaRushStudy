package com.javarush.task.task19.task1913;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Выводим только цифры
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        // Запоминаем настоящий PrintStream
        PrintStream defaultPrint = System.out;
        // Создаем динамический массив
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        // Создаем адаптер к классу PrintStream
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        // Устанавливаем его как текущий System.out
        System.setOut(printStream);
        // Вызываем функцию из которой перехватываем данные
        testString.printSomething();
        // Преобразовываем записанные в byteArrayOutputStream данные в строку
        String s = byteArrayOutputStream.toString();
        // Возвращаем System.out на место
        System.setOut(defaultPrint);
        System.out.println(s.replaceAll("[^0-9]", ""));

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
