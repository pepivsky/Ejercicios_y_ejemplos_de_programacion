package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a program that reads an array of ints and outputs the length of the longest sequence in strictly ascending order. Elements of the sequence must go one after another. A single number is assumed to be ordered sequence with the length = 1.
 *
 * Input data format
 *
 * The first line contains the size of an array.
 * The second line contains elements of the array separated by spaces.
 *
 * Example
 *
 * The input array is 1 2 4 1 2 3 5 7 4 3. In this case, the length of the longest sequence in ascending order is 5. It includes the following elements: 1 2 3 5 7.
 *
 * Sample Input 1:
 *
 * 10
 * 1 2 4 1 2 3 5 7 4 3
 * Sample Output 1:
 *
 * 5
 * ***/

public class LogestSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // solucion
        int length = scanner.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        int maxSequence = 1;
        int count = 1;

        for (int i = 1; i < length; i++) {
            if (array[i] > array[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > maxSequence) {
                maxSequence = count;
            }
        }

        System.out.println(maxSequence);

        //Solucion 2
        /*Scanner scanner = new Scanner(System.in);
        int lenght = scanner.nextInt();
        int[] array = new int[lenght];
        int numActual;
        int contador = 1;
        ArrayList<Integer> numeros = new ArrayList<>();

        //llenar el array
        for (int i = 0; i < lenght; i++) {
            array[i] = scanner.nextInt();
        }

        //Arrays.sort(array);//ordenando el arreglo
        //System.out.println(Arrays.toString(array));
        //Recorrer el arreglo

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    contador++;
                } else {
                    contador = 2;
                }

            }

        }
        //System.out.println("\nContador = " + contador);
         */

    }
}
