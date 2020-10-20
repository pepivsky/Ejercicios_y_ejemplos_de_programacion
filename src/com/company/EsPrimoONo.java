package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class EsPrimoONo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número para saber si es primo: ");
        int numero = scanner.nextInt();
        Integer[] arrayPrimos = {2, 3, 5, 7, 11}; //2 3 5 7 11  primeros numeros primos que nos sirven para revisar los demas
        boolean esPrimo = false;



        //no es primo
        if (numero % 2 == 0 || numero % 3 == 0 || numero % 5 == 0 || numero % 7 == 0 || numero % 11 == 0) {
            if (Arrays.asList(arrayPrimos).contains(numero)) { //revisar si el numero está en el array es primo
                esPrimo = true;
            } else {
                esPrimo = false;
            }
        } else { //Es Primo
            esPrimo = true;
        }

        System.out.println(esPrimo);
    }
}
