package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы
*/

public class Solution {
//    public static void main(String[] args) throws Exception {
//        if (args.length == 0) {
//            return;
//        }
//        switch (args[0]) {
//            case "-c":
//                BufferedReader reader = null;
//                BufferedReader reader1 = null;
//                FileWriter fileWriter = null;
//
//                try {
//                    String productName = "";
//                    String price;
//                    String quantity;
//                    for (int i = 1; i < args.length - 2; i++) {
//                        productName += args[i] + " ";
//                    }
//                    if (productName.length() > 30) {
//                        productName = productName.substring(0, 30);
//                    }
//                    price = args[args.length - 2];
//                    if (price.length() > 8) {
//                        price = price.substring(0, 8);
//                    }
//                    quantity = args[args.length - 1];
//                    if (quantity.length() > 4) {
//                        quantity = quantity.substring(0, 4);
//                    }
//
//                    reader = new BufferedReader(new InputStreamReader(System.in));
//                    ArrayList<String> arrayList = new ArrayList<>();
//                    String fileName = null;
//                    fileName = reader.readLine();
//
//                    reader1 = new BufferedReader(new FileReader(fileName));
//                    while (reader1.ready()) {
//                        String s = reader1.readLine();
//                        arrayList.add(s);
//                    }
//
//                    String fullInfo = arrayList.get(arrayList.size() - 1);
//                    int id = Integer.parseInt(fullInfo.substring(0, 8).trim());
//                    id = id + 1;
//                    if (String.valueOf(id).length() > 8) {
//                        id = id / 10;
//                    }
//                    arrayList.add(String.format("%-8s%-30s%-8s%-4s", String.valueOf(id),
//                            productName,
//                            price,
//                            quantity));
//
//                    fileWriter = new FileWriter(fileName, true);
//                        fileWriter.write("\n");
//                        fileWriter.write(arrayList.get(arrayList.size() - 1));
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//                reader.close();
//                reader1.close();
//                fileWriter.close();
//        }
//    }

    public static class Product {
        int id;
        String name;
        String price;
        String quantity;

        public Product(int id, String name, String price, String quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return String.format("%-8d%-30s%-8s%-4s", id, name, price, quantity);
        }
    }

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            return;
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        List<Product> products = new ArrayList<>();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready()) {
                Product product = getProduct(fileReader.readLine());
                products.add(product);
            }
        }

        switch (args[0]) {
            case "-c":
                int id = 0;
                for (Product product : products) {
                    if (product.id > id) id = product.id;
                }
                String name = "";
                for (int i = 1; i < args.length - 2; i++) {
                    name += args[i] + " ";
                }
                if (name.length() > 30) {
                    name = name.substring(0, 30);
                }
                String price = args[args.length - 2];
                if (price.length() > 8) {
                    price = price.substring(0, 8);
                }
                String quantity = args[args.length - 1];
                if (quantity.length() > 4) {
                    quantity = quantity.substring(0, 4);
                }
                Product product = new Product(++id, name.trim(), price, quantity);
                try (FileWriter fileWriter = new FileWriter(fileName, true)) {
                    fileWriter.write("\n");
                    fileWriter.write(product.toString());
                }
        }
    }

    public static Product getProduct(String string) {
        String id = string.substring(0, 8).trim();
        String name = string.substring(8, 38).trim();
        String price = string.substring(38, 46).trim();
        String quantity = string.substring(46, 50).trim();
        return new Product(Integer.parseInt(id), name, price, quantity);
    }
}
