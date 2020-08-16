package com.company;

import java.util.Scanner;
/**
 * Triples
 *
 * Write a program that reads an array of ints and outputs the number of "triples" in the array.
 *
 * A "triple" is three consecutive ints in increasing order differing by 1 (i.e. 3,4,5 is a triple, but 5,4,3 and 2,4,6 are not).
 *
 * Input data format
 *
 * The first line contains the size of an array.
 * The second line contains elements of the array separated by spaces.
 *
 * Output data format
 *
 * Only a single integer value: the number of "triples".
 *
 * Sample Input 1:
 *
 * 6
 * 1 2 4 5 6 7
 * Sample Output 1:
 *
 * 2
 * *****/
public class Triples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int contador = 0;

        //llenando el arreglo
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i - 1] == array[i] - 1 && array[i + 1] == array[i] + 1) { //Revisar si el siguiente es consecutivo
                contador++;
                //System.out.println("Entrando en el if");
            }

        }
        System.out.println(contador);

    }
}
