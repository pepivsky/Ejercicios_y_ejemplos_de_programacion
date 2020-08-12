package com.company;

import java.util.Scanner;

public class Triples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int contador = 1;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i+1] == array[i]+1) {
                contador++;
            }
        }

        /*//recorriendo el arreglo
        int siguiente = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i+1]) {
                contador++;
            }
        }
        System.out.println(contador/3);*/
        System.out.println(contador);

    }
}
