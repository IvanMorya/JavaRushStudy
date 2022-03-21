package com.javarush.task.task20.task2011;

import java.io.*;

/* 
Externalizable для апартаментов
*/

public class Solution {

    public static class Apartment implements Externalizable {

        private String address;
        private int year;

        /**
         * Mandatory public no-arg constructor.
         */
        public Apartment() {
            super();
        }

        public Apartment(String addr, int y) {
            address = addr;
            year = y;
        }

        /**
         * Prints out the fields used for testing!
         */
        public String toString() {
            return ("Address: " + address + "\n" + "Year: " + year);
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(address);
            out.writeInt(year);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            address = (String) in.readObject();
            year = in.readInt();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Apartment my_apartment = new Apartment("My Apartment", 2022);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\moryi\\IdeaProjects\\JavaRushTasks\\output.txt"));
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\moryi\\IdeaProjects\\JavaRushTasks\\output.txt"));

        objectOutputStream.writeObject(my_apartment);
        objectOutputStream.close();

        Apartment apartment = (Apartment) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(apartment.toString());
    }
}
