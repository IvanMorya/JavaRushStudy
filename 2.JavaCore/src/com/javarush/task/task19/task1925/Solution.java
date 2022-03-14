package com.javarush.task.task19.task1925;


import java.io.*;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) {
        String fileName1 = args[0];
        String fileName2 = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName1));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))) {
            ArrayList<String> list = new ArrayList<>();
            while (reader.ready()) {
                String current = reader.readLine();
                String[] split = current.split(" ");
                for (String s : split) {
                    if (s.length() > 6) {
                        list.add(s);
                    }
                }
            }
            StringBuffer buffer = new StringBuffer();
            for (String s : list) {
                buffer.append(s + " ");
            }
            String result = buffer.toString().trim();
            writer.write(result.replaceAll(" ", ","));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        String input;
//
//        ArrayList<String> fileContent = new ArrayList<String>();
//
//        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName1))) {
//            while ((input = fileReader.readLine()) != null)
//                fileContent.add(input);
//        } catch (IOException ignore) {
//            /* NOP */
//        }
//
//        StringBuffer sbLine = new StringBuffer();
//        for (String line : fileContent) {
//            String[] splitedLine = line.split(" ");
//            for (String word : splitedLine) {
//                if (word.length() > 6)
//
//                    sbLine.append(word).append(" ");
//            }
//        }
//
//        String resultLine = sbLine.toString().trim().replaceAll(" ", ",");
//        try (FileWriter fileWriter = new FileWriter(fileName2)) {
//            fileWriter.write(resultLine);
//        } catch (IOException ignore) {
//            /* NOP */
//        }
    }
}
