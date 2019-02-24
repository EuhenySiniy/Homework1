package com.company;

public class Task4 {

    public static void start() {
        System.out.print("Фибоначчи - 1");
        fibonacci(5);
        System.out.println();
        System.out.println("Факториал - " + factorial(6));
    }

    public static void fibonacci(int num) {
        int a = 1;
        int b = 1;
        int sum;
        for (int i = 0; i < num; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
        }

    }

    static int factorial(int num) {
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res = res * i;
        }
        return res;
    }
}
