package com.javarush.task.task19.task1920;

/*
Самый богатый
*/

public class Solution {
    public static void main(String[] args) {


//        TreeMap<String, Double> salary = new TreeMap<>();
//
//        String fileName = args[0];
//
//        try (BufferedReader rd = new BufferedReader(new FileReader(fileName))) {
//            String[] splitedLine;
//            String line;
//            Double currentValue;
//
//            while ((line = rd.readLine()) != null) {
//                splitedLine = line.split(" ");
//                String name = splitedLine[0];
//                double value = Double.parseDouble(splitedLine[1]);
//
//                if (salary.containsKey(name)) {
//                    currentValue = salary.get(name);
//                    salary.put(name, value + currentValue);
//                } else {
//                    salary.put(name, value);
//                }
//            }
//        } catch (IOException ignore) {
//            /*NOP */
//        }
//
//        double maxSalary = salary.firstEntry().getValue();
//        for (double value : salary.values()) {
//            if (value > maxSalary) {
//                maxSalary = value;
//            }
//        }
//
//        TreeSet<String> names = new TreeSet<>();
//        for (String name : salary.keySet()) {
//            if (maxSalary == salary.get(name)) {
//                names.add(name);
//            }
//        }
//
//        for (String name : names) {
//            System.out.println(name);
//        }
//
//    }

   /*
   Мое решение, которое не принимает валидатор. Мои тесты с разными вариациямы входных данных отрабатывают в
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