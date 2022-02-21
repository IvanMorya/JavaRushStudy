package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) {
        String fileName1 = null;
        String fileName2 = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName1));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))) {
            while (reader.ready()) {
                String s = reader.readLine();
                writer.write(s.replaceAll( "\\p{P}", ""));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
