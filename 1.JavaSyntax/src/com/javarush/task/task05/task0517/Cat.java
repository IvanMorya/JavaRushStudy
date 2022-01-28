package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name;
    int weight;
    int age;
    String color;
    String address;

    public Cat(String name) {
        this.name = name;
        this.weight = 5;
        this.age = 5;
        this.color = "Black";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Black";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.weight = 5;
        this.age = age;
        this.color = "Black";
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.age = 5;
        this.color = color;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.age = 5;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
