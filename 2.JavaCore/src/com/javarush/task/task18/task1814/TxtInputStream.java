package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
        if (!fileName.endsWith(".txt")) {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

//    public TxtInputStream(String fileName) throws FileNotFoundException, UnsupportedFileNameException {
//        super(fileName);
//        char[] s = fileName.toCharArray();
//        StringBuilder stringBuilder = new StringBuilder();
//        String extension;
//        extension = String.valueOf(stringBuilder.append(s, s.length - 4, 4));
//        if (!extension.equals(".txt")) {
//            try {
//                super.close();
//                throw new UnsupportedFileNameException();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }

    public static void main(String[] args) throws FileNotFoundException, UnsupportedFileNameException {

    }
}

