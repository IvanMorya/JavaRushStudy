package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader readerFromConsole = null;
        BufferedReader readerFromFile2 = null;
        BufferedReader readerFromFile3 = null;
        BufferedWriter writerToFile1 = null;

        String fileName1 = null;
        String fileName2 = null;
        String fileName3 = null;

        try {
            readerFromConsole = new BufferedReader(new InputStreamReader(System.in));
            fileName1 = readerFromConsole.readLine();
            fileName2 = readerFromConsole.readLine();
            fileName3 = readerFromConsole.readLine();
            readerFromFile2 = new BufferedReader(new FileReader(fileName2));
            writerToFile1 = new BufferedWriter(new FileWriter(fileName1));
            while (readerFromFile2.ready()) {
                writerToFile1.write(readerFromFile2.read());
            }
            readerFromFile3 = new BufferedReader(new FileReader(fileName3));
            while (readerFromFile3.ready()) {
                writerToFile1.write(readerFromFile3.read());
            }
        } catch (IOException f) {
            f.printStackTrace();
        } finally {
            readerFromConsole.close();
            readerFromFile2.close();
            readerFromFile3.close();
            writerToFile1.close();
        }
    }
}
