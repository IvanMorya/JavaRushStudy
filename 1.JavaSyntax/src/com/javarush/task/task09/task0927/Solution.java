package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();

        map.put("Барби", new Cat("Барби"));
        map.put("Murzik", new Cat("Murzik"));
        map.put("Rizik", new Cat("Rizik"));
        map.put("Pushok", new Cat("Pushok"));
        map.put("Homsa", new Cat("Homsa"));
        map.put("Homa", new Cat("Homa"));
        map.put("Kasya", new Cat("Kasya"));
        map.put("Kity", new Cat("Kity"));
        map.put("kjfsd", new Cat("kjfsd"));
        map.put("dd", new Cat("dd"));

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> cats = new HashSet<>();
        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            cats.add(pair.getValue());
        }
        return  cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}
