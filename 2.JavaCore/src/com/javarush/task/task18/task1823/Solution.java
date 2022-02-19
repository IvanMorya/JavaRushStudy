package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = null;
        while (!(fileName = reader.readLine()).equals("exit")) {
            new ReadThread(fileName).start();
        }
        reader.close();
    }

    public static class ReadThread extends Thread {
        String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            int maxByte = 0;
            int countByte = 0;
            int[] listByte = new int[257];
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                while (reader.ready()) {
                    listByte[reader.read()]++;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            for (int i = 1; i < listByte.length; i++) {
                if (listByte[i] > countByte) {
                    maxByte = i;
                    countByte = listByte[i];
                }
            }
            resultMap.put(fileName, maxByte);
        }
    }
}
