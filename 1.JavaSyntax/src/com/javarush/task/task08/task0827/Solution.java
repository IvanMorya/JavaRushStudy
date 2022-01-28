package com.javarush.task.task08.task0827;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date currentDate = new Date(date);
        Date startDate = new Date(date);
        startDate.setDate(1);
        startDate.setMonth(0);
        long time = currentDate.getTime() - startDate.getTime();
        System.out.println(time/1000/60/60/24 + 1);
        long days = time/1000/60/60/24 + 1;
        return days % 2 == 1;
    }
}
