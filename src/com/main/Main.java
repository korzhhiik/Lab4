package com.main;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[]{
                new Product(1, "Молоко", "123456", "Виробник1", 30.0, 10, 100),
                new Product(2, "Хліб", "123457", "Виробник2", 20.0, 5, 200),
                new Product(3, "Молоко", "123458", "Виробник3", 32.0, 12, 150),
        };
        printProductsByName(products, "Молоко");
    }

    public static void printProductsByName(Product[] products, String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                System.out.println(product);
            }
        }
    }
}
