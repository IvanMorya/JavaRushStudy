package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException, ParseException {
        Scanner scanner = new Scanner("Иванов Иван Иванович 31 12 1950");
        PersonScanner personScanner = new PersonScannerAdapter(scanner);
        Person person = personScanner.read();
        personScanner.close();
        System.out.println(person);
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String currentString = fileScanner.nextLine();
            String[] personFields = currentString.split(" ");
            String firstName = personFields[1];
            String middleName = personFields[2];
            String lastName = personFields[0];
            SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");
            Date birthDate = formatter.parse(personFields[3] + " " + personFields[4] + " " + personFields[5]);
            Person person = new Person(firstName, middleName, lastName, birthDate);
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
