package com.javarush.task.task19.task1923;

import java.awt.image.BufferedImageFilter;
import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) {
        String fileName1 = args[0];
        String fileName2 = args[1];
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName1));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))) {
            while (reader.ready()) {
                String current = reader.readLine();
                String[] words = current.split(" ");
                for (String word : words) {
                    if (word.matches(".*\\d+.*")) {
                        writer.write(word + " ");
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
