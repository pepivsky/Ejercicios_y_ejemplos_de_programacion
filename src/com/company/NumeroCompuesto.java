package com.company;

import java.util.Scanner;
/*
Programa que evalua si un numero es compuesto o no
 */
public class NumeroCompuesto {

    public static boolean isComposite(long number) {
        for (long i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }

}
