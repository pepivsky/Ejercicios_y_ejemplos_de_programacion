package com.company;

import java.util.Scanner;
/**
 * Write a program that prints a part of the sequence 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ... (the number is repeated as many times, to what it equals to). The input to the program is a positive integer n: the number of the elements of the sequence the program should print. Output the sequence of numbers, written in a single line, space-separated.
 *
 * For example, if n = 7, then the program should output 1 2 2 3 3 3 4.
 *
 *
 * Sample Input:
 * 7
 *
 * Sample Output:
 * 1 2 2 3 3 3 4
 * */

public class Secuencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        int contador = 0;

        for (int i = 0; i <= limit; i++) {
            for (int j = 1; j <= i ; j++) {
                if (contador == limit) {
                    break;
                } else {
                    System.out.print(i + " ");
                    contador++;
                }
            }
        }
        System.out.println();
        //System.out.println("contador = " + contador);
    }
}
