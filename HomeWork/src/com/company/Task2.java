package com.company;

public class Task2 {
    int middle = 10;

    public static void start() {
        Task2 go = new Task2();
        go.top();
        go.bottom();
    }

    private void top() {
        for (int top1 = 1; top1 < middle; top1++) {
            for (int top2 = middle; top2 > top1; top2--) {
                System.out.print(" ");
            }
            for (int top2 = 1; top2 < 2 * top1; top2++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void bottom() {
        for (int bottom1 = middle; bottom1 >= 1; bottom1--) {
            for (int bottom2 = middle; bottom2 > bottom1; bottom2--) {
                System.out.print(" ");
            }
            for (int bottom2 = 1; bottom2 < bottom1 * 2; bottom2++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
