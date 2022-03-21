package com.javarush.task.task20.task2016;

import java.io.*;

/* 
Минимум изменений
*/

public class Solution implements Serializable {
    public class A implements Serializable {
        String name = "A";

        public A(String name) {
            this.name += name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public class B extends A {
        String name = "B";

        public B(String name) {
            super(name);
            this.name += name;
        }
    }

    public class C extends B {
        String name = "C";

        public C(String name) {
            super(name);
            this.name = name;
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Solution solution = new Solution();
        Solution.C c = solution.new C("Z");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("TestObjectSave.ser"));
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("TestObjectSave.ser"));
        objectOutputStream.writeObject(c);
        Solution.C c1 = (C) objectInputStream.readObject();
        System.out.println(c1);
    }
}
