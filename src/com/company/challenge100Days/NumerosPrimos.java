package com.company.challenge100Days;

import java.util.Arrays;
import java.util.Scanner;
/**
 * Escribe un programa al que le indiques un número cómo límite y determinará todos los números primos desde el 1 hasta el número límite ingresado.
 * Recuerda que los números primos tienen las siguientes características:
 *
 * Es un número natural entero mayor a 1.
 * Tiene únicamente 2 divisores: el mismo número y el 1.
 * */

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número como límite:");
        int numero = scanner.nextInt();
        Integer[] arrayPrimos = {2, 3, 5, 7, 11}; //2 3 5 7 11
        int contadorPrimos = 0;


        for (int i = 2; i <= numero; i++) {
            //no es primo
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0 || i % 11 == 0) {
                if (Arrays.asList(arrayPrimos).contains(i)) { //revisar si el numero está en el array es primo
                    contadorPrimos += 1;
                }
            } else { //Es Primo
                contadorPrimos += 1;
            }
        }
        System.out.println("Entre 1 y " + numero + " hay " + contadorPrimos + " números primos");
    }
}
