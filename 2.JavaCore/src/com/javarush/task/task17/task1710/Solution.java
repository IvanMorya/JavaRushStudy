package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat formatIn = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        if (args[0].equals("-c")) {
            String name = args[1];
            Sex sex;
            if (args[2].equals("м")) {
                sex = Sex.MALE;
            } else {
                sex = Sex.FEMALE;
            }
            Date bd = formatIn.parse(args[3]);
            Person p;
            if (sex == Sex.MALE) {
                allPeople.add(p = Person.createMale(name, bd));
                System.out.println(allPeople.indexOf(p));
            } else {
                allPeople.add(p = Person.createFemale(name, bd));
                System.out.println(allPeople.indexOf(p));
            }
        } else if (args[0].equals("-r")) {
            int id = Integer.parseInt(args[1]);
            String name = allPeople.get(id).getName();
            Sex sex = allPeople.get(id).getSex();
            Date bd = allPeople.get(id).getBirthDate();
            if (sex == Sex.MALE) {
                System.out.println(name + " м " + formatOut.format(bd));
            } else {
                System.out.println(name + " ж " + formatOut.format(bd));
            }
        } else if (args[0].equals("-u")) {
            int id = Integer.parseInt(args[1]);
            String name = args[2];
            Sex sex;
            if (args[3].equals("м")) {
                sex = Sex.MALE;
            } else {
                sex = Sex.FEMALE;
            }
            Date bd = formatIn.parse(args[4]);
            if (sex == Sex.MALE) {
                allPeople.set(id, Person.createMale(name, bd));
            } else {
                allPeople.set(id, Person.createFemale(name, bd));
            }
        } else if (args[0].equals("-d")) {
            int id = Integer.parseInt(args[1]);
            allPeople.get(id).setName(null);
            allPeople.get(id).setSex(null);
            allPeople.get(id).setBirthDate(null);
        }
    }
}
