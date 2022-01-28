package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int ageScore = Integer.compare(this.age, anotherCat.age);
        int weightScore = Integer.compare(this.weight, anotherCat.weight);
        int strengthScore = Integer.compare(this.strength, anotherCat.strength);

        int score = ageScore + weightScore + strengthScore;
        return score > 0;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.strength = 10;
        cat1.weight = 10;
        cat1.age = 3;

        Cat cat2 = new Cat();
        cat2.strength = 10;
        cat2.weight = 10;
        cat2.age = 4;

        System.out.println(cat1.fight(cat2));
    }
}
