package com.company;

import java.util.Scanner;
/**
 * Write a program that reads the numbers a, b, c and checks if any pair of them sums to 20.
 *
 * The program must output true or false.
 * */
public class CheckTheSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean is20 = false;

        if ((a % 2 == 0 && b % 2 == 0) && a + b == 20) {
            is20 = true;
        } else if ((b % 2 == 0 && c % 2 == 0) && b + c == 20) {
            is20 = true;
        } else if ((c % 2 == 0 && a % 2 == 0) && c + a == 20) {
            is20 = true;
        } else {
            is20 = false;
        }
        System.out.println(is20);
    }
}
