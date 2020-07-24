package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextInt();
        long resultado = 1;

        for (int i = 1; i <= number ; i++) {
            resultado = resultado * i;
            System.out.println(resultado);

        }
        //System.out.println(resultado);

    }
}
