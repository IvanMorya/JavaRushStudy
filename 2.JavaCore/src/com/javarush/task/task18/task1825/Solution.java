package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFileName = null;
        String outputFileName = null;
        TreeSet<String> files = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1.substring(o1.lastIndexOf(".part") + 5)) - Integer.parseInt(o2.substring(o2.lastIndexOf(".part") + 5));
            }
        });
        while (!(inputFileName = reader.readLine()).equals("end")) {
            files.add(inputFileName);
            if (outputFileName == null) {
                outputFileName = inputFileName.substring(0, inputFileName.lastIndexOf(".part"));
            }
        }
        reader.close();
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(outputFileName))) {
            for (String file : files) {
                try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file))) {
                    while (bufferedInputStream.available() > 0) {
                        bufferedOutputStream.write(bufferedInputStream.read());
                    }
                }
            }
        }
    }
}
