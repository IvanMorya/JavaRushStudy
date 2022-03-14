package com.javarush.task.task19.task1927;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Контекстная реклама
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream defaultPrintStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        System.setOut(new PrintStream(byteArrayOutputStream));

        testString.printSomething();

        System.setOut(defaultPrintStream);

        String[] byteArray = byteArrayOutputStream.toString().split("\\n");
        for (int i = 0; i < byteArray.length; i++) {
            System.out.println(byteArray[i]);
            if (i % 2 != 0)
                System.out.println("JavaRush - курсы Java онлайн");
        }

//        PrintStream consoleStream = System.out;
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        PrintStream stream = new PrintStream(outputStream);
//        System.setOut(stream);
//        testString.printSomething();
//        System.setOut(consoleStream);
//        String result = outputStream.toString();
//        String advertising = "JavaRush - курсы Java онлайн";
//        String[] words = result.split("\\n");
//        int counter = 0;
//        for (String word : words) {
//            if (counter == 2) {
//                System.out.println(advertising);
//                System.out.println(word);
//                counter = 1;
//            } else {
//                System.out.println(word);
//                counter++;
//            }
//        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
