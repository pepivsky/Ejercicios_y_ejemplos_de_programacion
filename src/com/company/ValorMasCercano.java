package com.company;

import java.util.Scanner;
//clase para que nos dice el valor mas cercano a uno ingresado, lo compara con los elementos de un arreglo de enteros
public class ValorMasCercano {
    public static void main(String[] args) {
        int[] numeros = {3, 7}; //valores a evaluar
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int num = scanner.nextInt();

        int resultado = masCercano(numeros, num);
        System.out.println(resultado);


    }

    public static int masCercano(int[] numeros, int num) {
        int cercano = 0;
        int diferencia = Integer.MAX_VALUE; //inicializado valor máximo de variable de tipo int
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num) {
                return numeros[i];
            } else {
                if (Math.abs(numeros[i] - num) < diferencia) {
                    cercano = numeros[i];
                    diferencia = Math.abs(numeros[i] - num);
                }
            }
        }
        return cercano;
    }
}
