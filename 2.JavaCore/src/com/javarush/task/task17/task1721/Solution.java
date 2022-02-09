package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firsFile = null;
        String secondFile = null;
        try {
            firsFile = reader.readLine();
            secondFile = reader.readLine();
            reader.close();
            BufferedReader bufferedReader1 = new BufferedReader(new FileReader(firsFile));
            String input;
            while ((input = bufferedReader1.readLine()) != null) {
                allLines.add(input);
            }
            bufferedReader1.close();
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(secondFile));
            while ((input = bufferedReader2.readLine()) != null) {
                forRemoveLines.add(input);
            }
            bufferedReader2.close();
            new Solution().joinData();
        } catch (Exception e) {
        }

    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines))
            allLines.removeAll(forRemoveLines);
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
