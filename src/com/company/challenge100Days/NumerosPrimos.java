package com.company.challenge100Days;

import java.util.Arrays;
import java.util.Scanner;


public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        Integer[] arrayPrimos = {2, 3, 5, 7, 11};
        //2 3 5 7 11
        int contador = 0;
        //boolean estaEnLista = (String) Arrays.asList(arrayPrimos).contains(numero);
        boolean contiene = Arrays.asList(arrayPrimos).contains(numero);
        //System.out.println(contiene);


        //no es primo
        if (numero % 2 == 0 || numero % 3 == 0 || numero % 5 == 0 || numero % 7 == 0 || numero % 11 == 0) {
            if (contiene) {
                System.out.println("Es primo");
            } else {
                System.out.println("No es primo");
            }


        } else { //Es Primo
            System.out.println("Es primo");
        }
    }
}
