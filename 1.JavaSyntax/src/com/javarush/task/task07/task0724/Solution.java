package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Human grandfather = new Human("Ivan", true, 80);
        Human grandmother = new Human("Nadya", false, 78);

        Human grandfather2 = new Human("Vasili", true, 81);
        Human grandmother2 = new Human("Tamara", false, 77);


        Human father = new Human("Sasha", true, 55, grandfather, grandmother);
        Human mother = new Human("Luda", false, 54, grandfather2, grandmother2);

        Human olderSon = new Human("Kiril", true, 35, father, mother);
        Human yangSon = new Human("Vanya", true, 34, father, mother);
        Human daughter = new Human("Katya", false, 31, father, mother);

        System.out.println(grandfather);
        System.out.println(grandmother);
        System.out.println(grandfather2);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(olderSon);
        System.out.println(yangSon);
        System.out.println(daughter);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}