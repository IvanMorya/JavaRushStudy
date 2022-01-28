package com.javarush.task.task09.task0908;

/* 
Исключение при работе со строками
*/

public class Solution {
    public static void main(String[] args) {
        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException o) {
            System.out.println(o);
//            java.lang.NullPointerException: Cannot invoke "String.toLowerCase()" because "s" is null
        }
    }
}
