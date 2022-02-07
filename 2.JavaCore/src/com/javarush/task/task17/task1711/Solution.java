package com.javarush.task.task17.task1711;

import com.javarush.task.task17.task1710.Sex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    static SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    public static void main(String[] args) throws ParseException {
        if (args == null || args.length < 1) {
            throw new RuntimeException();
        }
        switch (args[0]) {
            case "-c":
                int countParam = ((args.length - 1) / 3);
                for (int i = 1; i < countParam + 1; i++) {
                    if (getSex(args[i + 1]) == Sex.MALE) {
                        allPeople.add(Person.createMale(args[i], simpleDateFormat.parse(args[i + 2])));
                    } else {
                        allPeople.add(Person.createFemale(args[i], simpleDateFormat.parse(args[i + 2])));
                    }
                    System.out.println(allPeople.size() - 1);
                }
                break;
            case "-u":

                break;
            case "-d":

                break;
            case "-i":

                break;
        }

    }

    private static Sex getSex(String sexParam) {
        return sexParam.equals("м") ? com.javarush.task.task17.task1710.Sex.MALE : Sex.FEMALE;
    }
}
