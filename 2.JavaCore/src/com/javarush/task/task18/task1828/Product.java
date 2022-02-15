package com.javarush.task.task18.task1828;

public class Product {
    private String id;

    public String getId() {
        return id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    private String productName;
    private String price;
    private String quantity;

    Product(String id, String productName, String price, String quantity) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static Product GetProductFromString(String s){
        String id = s.substring(0, 8).trim();
        String productName = s.substring(8, 38).trim();
        String price = s.substring(38, 46).trim();
        String quantity = s.substring(46).trim();
        return new Product(id, productName, price, quantity);
    }

    @Override
    public String toString() {
        return String.format("%-8s%-30s%-8s%-4s", id, productName, price, quantity);
    }
}
