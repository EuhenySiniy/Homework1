package com.company;

public class Task3 {

    public static void start() {
        System.out.println("Число в квадрате - " + square(5));
        System.out.println("Число в кубе - " + cube(3));
        System.out.println("Число в степени - " + power(4, 2));
    }

    public static int square(int a) {
        int b = a * a;
        return b;
    }

    public static int cube(int a) {
        int b = a * a * a;
        return b;
    }

    public static int power(int num, int pow) {
        int res = 1;
        for (int i = 1; i <= pow; i++) {
            res = res * num;
        }
        return res;
    }
}
