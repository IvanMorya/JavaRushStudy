package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> first = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int x = Integer.parseInt(console.readLine());
            first.add(x);
        }

        ArrayList<Integer> intDivideWithoutZeroBy3 = new ArrayList<>();
        ArrayList<Integer> intDivideWithoutZeroBy2 = new ArrayList<>();
        ArrayList<Integer> intDivideWithoutZeroBy3And2 = new ArrayList<>();

        for (int i = 0; i < first.size(); i++) {
            int x = first.get(i);

            if (x % 3 == 0 || x % 2 == 0) {
                if (x % 3 == 0){
                    intDivideWithoutZeroBy3.add(x);
                }
                if (x % 2 == 0){
                    intDivideWithoutZeroBy2.add(x);
                }
            } else {
                intDivideWithoutZeroBy3And2.add(x);
            }
        }

        printList(intDivideWithoutZeroBy3);
        printList(intDivideWithoutZeroBy2);
        printList(intDivideWithoutZeroBy3And2);
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer i : list) {
            System.out.println(i + " ");
        }
    }
}
