package com.company.challenge100Days;

import java.util.Scanner;

public class NumeroSecreto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numAleatorio = (int) ((Math.random() * (10 - 1 + 1)) + 1);
        //System.out.println(numAleatorio);
        System.out.println("Adivina el número secreto entre 1 y 10");
        int num = 0;
        int contador = 0;

        do {
            num = scanner.nextInt();
            if (num < numAleatorio) {
                System.out.println("El número secreto es mayor");
                contador++;
            } else if (num > numAleatorio) {
                System.out.println("El número secreto es menor");
                contador++;
            }
        } while (num != numAleatorio);
        System.out.println("Adivinaste! te tomó: " + contador + " intentos");
    }
}
