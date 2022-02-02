package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();

    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            int countTreadSleep = 0;
            for (int i = numSeconds; i > 0; i--) {
                System.out.print(numSeconds + " ");
                numSeconds--;
                try {
                    Thread.sleep(1000);
                    countTreadSleep++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (countTreadSleep < 4) {
                System.out.print("Марш!");
            } else {
                System.out.println("Прервано!");
            }
        }
    }
}
