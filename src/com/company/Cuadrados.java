package com.company;

import java.util.Scanner;
/**
 * Read an integer number N from the input and print all the squares of natural numbers:
 *
 * less than or equal to N,
 * in ascending order.
 * Sample Input 1:
 *
 * 50
 * Sample Output 1:
 *
 * 1
 * 4
 * 9
 * 16
 * 25
 * 36
 * 49
 * Sample Input 2:
 *
 * 1
 * Sample Output 2:
 *
 * 1
 * */
public class Cuadrados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int square;


        if (n == 1) {
            System.out.println(1);
        } else {
            for (int i = 1; i < n; i++) {
                square = i * i;
                if (square <= n) {
                    System.out.println(square);
                } else {
                    break;
                }

            }
        }

    }
}
