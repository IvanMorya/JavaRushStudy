package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private int weigh;
        private String hairColor;
        private Boolean sex;
        private String race;

        public Human() {

        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, int weigh) {
            this.name = name;
            this.age = age;
            this.weigh = weigh;
        }

        public Human(String name, int age, int weigh, String hairColor) {
            this.name = name;
            this.age = age;
            this.weigh = weigh;
            this.hairColor = hairColor;
        }

        public Human(String name, int age, int weigh, String hairColor, Boolean sex) {
            this.name = name;
            this.age = age;
            this.weigh = weigh;
            this.hairColor = hairColor;
            this.sex = sex;
        }

        public Human(String name, int age, int weigh, String hairColor, Boolean sex, String race) {
            this.name = name;
            this.age = age;
            this.weigh = weigh;
            this.hairColor = hairColor;
            this.sex = sex;
            this.race = race;
        }

        public Human(String name,Boolean sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, String race) {
            this.name = name;
            this.race = race;
        }

        public Human(String name, int age, int weigh,Boolean sex, String race) {
            this.name = name;
            this.age = age;
            this.weigh = weigh;
            this.sex = sex;
            this.race = race;
        }

    }
}
