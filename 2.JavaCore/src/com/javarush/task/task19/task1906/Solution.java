package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) {
        String file1 = null;
        String file2 = null;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            file1 = reader.readLine();
            file2 = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fileReader = new FileReader(file1);
             FileWriter fileWriter = new FileWriter(file2)) {
            int count = 1;
            while (fileReader.ready()) {
                if (count%2 == 0) {
                    fileWriter.write(fileReader.read());
                    count++;
                    continue;
                }
                fileReader.read();
                count++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
