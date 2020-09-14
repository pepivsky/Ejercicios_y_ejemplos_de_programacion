package com.company.challenge100Days;

import java.util.Arrays;
import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número como límite:");
        int numero = scanner.nextInt();
        Integer[] arrayPrimos = {2, 3, 5, 7, 11}; //2 3 5 7 11  primeros numeros primos que nos sirven para revisar los demas
        int contadorPrimos = 0;
        long primo = 0;

        /*while (contadorPrimos != numero ) {

        }*/


        for (long i = 1; contadorPrimos <= numero; i++) {
            //no es primo
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0 || i % 11 == 0) {
                if (Arrays.asList(arrayPrimos).contains((int)i)) { //revisar si el numero está en el array es primo
                    contadorPrimos += 1;
                    System.out.println(i);
                }
            } else { //Es Primo
                contadorPrimos += 1;
                //if (contadorPrimos <= )
                System.out.println(i);
                primo = i;
            }
        }
        //System.out.println("Entre 1 y " + numero + " hay " + contadorPrimos + " números primos");
        System.out.println("El primo es: " + primo);
    }
}
