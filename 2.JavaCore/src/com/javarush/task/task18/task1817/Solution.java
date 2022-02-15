package com.javarush.task.task18.task1817;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int spaceCount = 0;
        int allChar = 0;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(args[0]));
            while (reader.ready()) {
                char current = (char) reader.read();
                if (current == ' ') {
                    spaceCount++;
                }
                allChar++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
        double result = (spaceCount/(allChar * 1.0)) * 100;
//        private static double round(double value, int places)
//            if (places < 0) throw new IllegalArgumentException();
            BigDecimal bd = new BigDecimal(Double.toString(result));
            bd = bd.setScale(2, RoundingMode.HALF_UP);
        System.out.println(bd.doubleValue());
    }
}
