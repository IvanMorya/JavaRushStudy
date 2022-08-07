package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* 
Обращенные слова
*/

public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        try (BufferedReader readerFromUser = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader readerFromFile = new BufferedReader(new FileReader(readerFromUser.readLine()))) {
            while (readerFromFile.ready()) {
                String[] words = readerFromFile.readLine().split(" ");
                arrayList.addAll(Arrays.asList(words));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.size(); ) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (arrayList.get(j).equals(new StringBuilder(arrayList.get(i)).reverse().toString()) && j != i) {
                    Pair pair = new Pair();
                    pair.first = arrayList.get(j);
                    pair.second = arrayList.get(i);
                    result.add(pair);
                    arrayList.remove(j);
                    arrayList.remove(i);
                    j = 0;
                } else
                    j++;
            }
        }

//        for (int i = 0; i < arrayList.size(); i++) {
//            StringBuilder stringBuilder = new StringBuilder(arrayList.get(i));
//            String revers = stringBuilder.reverse().toString();
//            if (arrayList.contains(revers)) {
//                Pair pair = new Pair();
//                pair.first = arrayList.get(i);
//                pair.second = revers;
//                result.add(pair);
//            }
//            arrayList.remove(revers);
//            arrayList.remove(arrayList.get(i));
//        }

        for (Pair pair : result) {
            System.out.println(pair);
        }

    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
