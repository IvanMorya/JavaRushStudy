package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new ThreadInfinity());
        threads.add(new ThreadException());
        threads.add(new ThreadExclamation());
        threads.add(new ThreadMessage());
        threads.add(new ThreadNumberReader());
    }

    public static void main(String[] args) {
    }

    public static class ThreadInfinity extends Thread {
        public void run() {
            while (true) {
            }
        }
    }

    public static class ThreadException extends Thread {
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static class ThreadExclamation extends Thread {
        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class ThreadMessage extends Thread implements Message {
        public void run() {
            while (!isInterrupted()) {
            }
        }

        @Override
        public void showWarning() {
            this.interrupt();
        }
    }

    public static class ThreadNumberReader extends Thread {
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s;
            int sum = 0;
            try {
                while (!(s = reader.readLine()).equals("N")) {
                    sum += Integer.valueOf(s);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(sum);
        }
    }
}
