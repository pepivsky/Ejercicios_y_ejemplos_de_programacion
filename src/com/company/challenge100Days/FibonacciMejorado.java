package com.company.challenge100Days;

import java.math.BigInteger;
import java.util.Scanner;
/**
 * Realizar un programa que sea capaz de mostrar el fibonacci de 10,000
 * */
public class FibonacciMejorado {

    public static BigInteger fibonacciDinamico(int n) {

        if (n == 0) {
            return BigInteger.ZERO;
        } else {
            BigInteger[] array = new BigInteger[(int) n + 1];
            array[0] = BigInteger.valueOf(0);
            array[1] = BigInteger.valueOf(1);

            for (int i = 2; i <= n; i++) {
                array[i] = array[i - 1].add(array[i - 2]);//suma -1 y -2

            }
            return array[(int) n];
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número para calcular su Fibonacci");
        int n = scanner.nextInt();
        System.out.println(fibonacciDinamico(n));

    }
}