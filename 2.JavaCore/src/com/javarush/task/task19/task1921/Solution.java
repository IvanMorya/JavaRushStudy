package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<>();

    public static void main(String[] args) {
        String fileName = args[0];
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.ready()) {
                String current = reader.readLine();
                String name = getNameFromString(current);
                Date date = getDateFromString(current);
                System.out.println(date);
                PEOPLE.add(new Person(name, date));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getNameFromString(String current) {
        String result = current.replaceAll("\\d", "").trim();
        return result;
    }

    private static Date getDateFromString(String current) {
        String withoutName = current.replaceAll("[^0-9 ]", "").trim();
        String[] sDate = withoutName.split(" ");
        GregorianCalendar gregorianCalendar = new GregorianCalendar(Integer.parseInt(sDate[2]), Integer.parseInt(sDate[1]) - 1, Integer.parseInt(sDate[0]));
        Date date = gregorianCalendar.getTime();
        return date;
    }
}
