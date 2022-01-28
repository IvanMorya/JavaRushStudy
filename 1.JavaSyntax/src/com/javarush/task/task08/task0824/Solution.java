package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        Human child3 = new Human("Кирил", true, 35);
        Human child2 = new Human("Ваня", true, 34);
        Human child1 = new Human("Катя", false, 35);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        ArrayList<Human> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        children.add(child3);
        Human father = new Human("Саша", true, 55, children);
        Human mother = new Human("Люда", false, 54, children);
        System.out.println(father);
        System.out.println(mother);
        ArrayList<Human> children2 = new ArrayList<>();
        ArrayList<Human> children3 = new ArrayList<>();
        children2.add(father);
        children3.add(mother);
        Human grandfather1 = new Human("Ваня", true, 80, children2);
        Human grandmother1 = new Human("Надя", true, 80, children2);
        Human grandfather2 = new Human("Вася", true, 80, children3);
        Human grandmother2 = new Human("Тамара", true, 80, children3);
        System.out.println(grandfather1);
        System.out.println(grandmother1);
        System.out.println(grandfather2);
        System.out.println(grandmother2);
    }

    public static class Human {
        String name;
        Boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, Boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, Boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
