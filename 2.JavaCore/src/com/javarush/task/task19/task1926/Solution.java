package com.javarush.task.task19.task1926;

import java.io.*;
import java.util.ArrayList;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileIn = new BufferedReader(new FileReader(reader.readLine()))) {
            while (fileIn.ready()) {
                String line = fileIn.readLine();
                System.out.println(new StringBuffer(line).reverse());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        String fileName = null;
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            fileName = reader.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        ArrayList<Character> characters = new ArrayList<>();
//        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
//            while (reader.ready()) {
//                String current = reader.readLine();
//                for (int i = current.length() - 1; i >= 0 ; i--) {
//                    System.out.print(current.charAt(i));
//                }
//                System.out.println();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
