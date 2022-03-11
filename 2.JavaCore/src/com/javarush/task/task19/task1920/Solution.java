package com.javarush.task.task19.task1920;

/*
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {
        HashMap<String, Double> list = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String current = reader.readLine();
                String[] split = current.split(" ");
                if (list.containsKey(split[0])) {
                    Double d = list.get(split[0]);
                    list.put(split[0], d + Double.parseDouble(split[1]));
                } else {
                    list.put(split[0], Double.parseDouble(split[1]));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        double max = 0.0;
        for (Map.Entry<String, Double> pair : list.entrySet()) {
            if (pair.getValue() > max) {
                max = pair.getValue();
            }
        }

        TreeSet<String> names = new TreeSet<>();
        for (Map.Entry<String, Double> pair : list.entrySet()) {
            if (pair.getValue() == max) {
                names.add(pair.getKey());
            }
        }

        for (String name : names) {
            System.out.println(name);
        }

   /*
   Мой первый вариант решения, которое не принимает валидатор. Мои тесты с разными вариациямы входных данных отрабатывают в
   соответствии с требованиями задания, включая тест с входными данными которые указанны в задании.
   */
//        List<Person1> persons = new ArrayList<>();
//        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
//            while (reader.ready()) {
//                Person1 currentReadPerson = parsePerson(reader.readLine());
//                String currentReadPersonName = currentReadPerson.getName();
//                double currentReadPersonValue = currentReadPerson.getValue();
//                for (int i = 0; i < persons.size(); i++) {
//                    if ((persons.get(i).getName()).equals(currentReadPersonName)) {
//                        persons.set(i, new Person1(currentReadPersonName, currentReadPersonValue + persons.get(i).getValue()));
//                    }
//                }
//                persons.add(currentReadPerson);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        ArrayList<Person1> personsWithMaxValue = new ArrayList<>();
//        Person1 personWithMaxValue = new Person1(" ", 0);
//
//        for (Person1 person : persons) {
//            if (person.getValue() > personWithMaxValue.getValue()) {
//                personWithMaxValue = person;
//            }
//        }
//        personsWithMaxValue.add(personWithMaxValue);
//
//        for (Person1 person : persons) {
//            if (person.getValue() == personWithMaxValue.getValue() && !(person.getName().equals(personWithMaxValue.getName()))) {
//                personsWithMaxValue.add(person);
//            }
//        }
//
//        Collections.sort(personsWithMaxValue);
//
//        for (Person1 person : personsWithMaxValue) {
//            System.out.println(person.getName());
//        }
    }

//    public static Person1 parsePerson(String s) {
//        String[] nameAndValue = s.split(" ");
//        return new Person1(nameAndValue[0], Double.parseDouble(nameAndValue[1]));
//    }
}

//class Person1 implements Comparable<Person1>{
//    private String name;
//    private double value;
//
//    Person1(String name, double value) {
//        this.name = name;
//        this.value = value;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public double getValue() {
//        return value;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setValue(double value) {
//        this.value = value;
//    }
//
//    @Override
//    public int compareTo(Person1 o) {
//        return this.getName().compareTo(o.getName());
//    }
//}