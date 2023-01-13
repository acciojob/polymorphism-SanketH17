package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        int res1 = p.product(10,20);
        int res2 = p.product(2, 4, 6);
        double res3 = p.product(1.1, 2.2);

        // print
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}

class Product {
    public int product(int x, int y) {
        return x * y;
    }
    public int product(int x, int y, int z) {
        return x * y * z;
    }

    public double product(double x, double y) {
        return x * y;
    }

}