package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    int b1;
    int b2;
    int res1;
    int res2;

    public static void start() {
        Task1 go = new Task1();
        go.bet();
        go.exodus();
        System.out.println(go.check());
    }

    public void bet() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите исход 1й команды: ");
        b1 = in.nextInt();
        System.out.println("Введите исход 2й команды: ");
        b2 = in.nextInt();
        System.out.println("Ваш прогноз - " + b1 + ":" + b2);
    }

    public void exodus() {
        Random random = new Random();
        res1 = random.nextInt(4);
        res2 = random.nextInt(4);
        System.out.println("Результат матча - " + res1 + ":" + res2);
    }

    public String check() {
        String check = (b1 == res1 && b2 == res2) ? "2" : ((b1 > b2 && res1 > res2) || (b1 < b2 && res1 < res2) ? "1" : "0");
        return check;
    }
}
