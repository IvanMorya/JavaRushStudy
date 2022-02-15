package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
Прайсы 2
*/
//C:\Users\moryi\OneDrive\Рабочий стол\Новый текстовый документ (3).txt
public class Solution {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }
        String fileName = null;
        List<Product> products = new ArrayList<>();
        try {
            BufferedReader readerFromConsole = new BufferedReader(new InputStreamReader(System.in));
            fileName = readerFromConsole.readLine();
            readerFromConsole.close();
            BufferedReader readerFromFile = new BufferedReader(new FileReader(fileName));
            while (readerFromFile.ready()) {
                String s = readerFromFile.readLine();
                Product p = Product.GetProductFromString(s);
                products.add(p);
            }
            readerFromFile.close();

            for (Product product : products) {
                if (product.getId().equals(args[1].trim())) {
                    switch (args[0]) {
                        case "-u":
                            String productName = "";
                            for (int i = 3; i < args.length - 2; i++) {
                                productName += args[i];
                            }
                            product.setProductName(productName);
                            product.setPrice(args[args.length - 2]);
                            product.setQuantity(args[args.length - 1]);
                            break;
                        case "-d":
                            products.remove(product);
                    }
                }
            }
            BufferedWriter writerToFile = new BufferedWriter(new FileWriter(fileName));
            for (Product product : products) {
                writerToFile.write(product.toString());
            }
            writerToFile.close();

        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
