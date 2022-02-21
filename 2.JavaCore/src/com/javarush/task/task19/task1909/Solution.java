package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) {
        String fileName1 = null;
        String fileName2 = null;
        try (BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = reader1.readLine();
            fileName2 = reader1.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName1));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))) {
            while (reader.ready()) {
                String s = reader.readLine();
                writer.write(s.replaceAll("\\.", "!"));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
