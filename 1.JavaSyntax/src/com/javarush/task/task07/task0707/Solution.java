package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Привет");
        list.add("Как дела?");
        list.add("I learn programming");
        list.add("All will be cool");
        list.add("I study java");
        System.out.println(list.size());
        for (String str : list) {
            System.out.println(str);
        }
    }
}
