package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/

public class Solution implements Serializable, AutoCloseable {
    public static void main(String[] args) {
        try {
            Solution solution = new Solution("SerializeObject.bin");
            solution.writeObject("Привет! Как дела?");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("S.bin"));
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("S.bin"));

            objectOutputStream.writeObject(solution);
            Solution solution1 = (Solution) objectInputStream.readObject();
            solution1.writeObject("Все еще привет!");

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private transient FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.stream = new FileOutputStream(fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }
}
