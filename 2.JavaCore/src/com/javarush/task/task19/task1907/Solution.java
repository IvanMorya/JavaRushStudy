package com.javarush.task.task19.task1907;

import java.io.*;

/* 
Считаем слово
*/

public class Solution {
    private static int counter = 0;

    public static void main(String[] args) {

        String fileName = null;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            try {
                fileName = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuilder text = new StringBuilder();
        try (FileReader reader = new FileReader(fileName)) {
            char currentChar;
            while (reader.ready()) {
                currentChar = (char) reader.read();
                text.append(currentChar);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String replacedString = text.toString().replaceAll("\\p{P}", " ").replaceAll("\\s", " ");

        for (String x : replacedString.split(" ")) {
            if (x.equals("world")) {
                counter++;
            }
        }

        System.out.println(counter);
        
//        String fileName = null;
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            fileName = reader.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        int countWorld = 0;
//        String currentString = "";
//        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
//            while ((currentString = reader.readLine()) != null) {
//                String[] s = currentString.split("[,.:; \"']");
//                for (String s1 : s) {
//                    if (s1.equalsIgnoreCase("world")) {
//                        countWorld++;
//                    }
//                }
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(countWorld);
    }
}
