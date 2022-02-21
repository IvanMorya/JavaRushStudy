package com.javarush.task.task19.task1912;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Ридер обертка 2
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        // Запоминаем настоящий PrintStream в специальную переменную
        PrintStream consoleStream = System.out;
        // Создаем динамический массив
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        // Создаем адаптер к классу PrintStream
        PrintStream stream = new PrintStream(outputStream);
        // Устанавливаем его как текущий System.out
        System.setOut(stream);
        // Вызываем функцию, которая выводит текст к в созданный stream
        testString.printSomething();
        // Сохраняем в строку информацию из ByteArray
        String s = outputStream.toString();
        // Возвращаем управление System.out
        System.setOut(consoleStream);
        // Производим необходимые действия со строкой установленные заданием
        System.out.println(s.replaceAll("te", "??"));

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
