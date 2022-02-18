package com.javarush.task.task18.task1822;


import java.io.*;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        String str;
//        try (BufferedReader bufferedFileReader = new BufferedReader(new FileReader(reader.readLine()))) {
//            while ((str = bufferedFileReader.readLine()) != null) {
//                if (str.startsWith(args[0] + " ")) {
//                    System.out.println(str);
//                    break;
//                }
//            }
//        }

        String fileName = null;
        BufferedReader fileReader = null;
        try {
            fileName = reader.readLine();
            fileReader = new BufferedReader(new FileReader(fileName));
            while (fileReader.ready()) {
                String product = fileReader.readLine();
                if (product.startsWith(args[0])) {
                    System.out.println(product);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        reader.close();
        fileReader.close();
    }
}
