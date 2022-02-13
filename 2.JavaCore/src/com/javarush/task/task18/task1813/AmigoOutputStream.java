package com.javarush.task.task18.task1813;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";

    FileOutputStream f;

    public AmigoOutputStream(FileOutputStream f) throws FileNotFoundException {
        super(fileName);
        this.f = f;
    }

    @Override
    public void write(int b) throws IOException {
        f.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        f.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        f.write(b, off, len);
    }

    @Override
    public void flush() throws IOException {
        f.flush();
    }

    @Override
    public void close() throws IOException {
        flush();
        write("JavaRush © All rights reserved.".getBytes());
        f.close();
    }

    @Override
    public FileChannel getChannel() {
        return f.getChannel();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
