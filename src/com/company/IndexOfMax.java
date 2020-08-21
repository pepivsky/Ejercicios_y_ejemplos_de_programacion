package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class IndexOfMax {
    /**
     * The index of the first max in an array
     *  Medium
     *  9 minutes
     * 2087 users solved this problem. Latest completion was
     * about 1 hour ago
     * .
     * Write a program that reads an array of ints and finds the index of the first maximum in an array.
     *
     * Input data format
     *
     * The first line contains the number of elements in the array.
     *
     * The second line contains the array elements separated by spaces.
     *
     * An array always has at least one element.
     *
     * Output data format
     *
     * Only a single integer value: the index of the first maximum.
     *
     * Sample Input 1:
     *
     * 5
     * 2 5 3 4 5
     * Sample Output 1:
     *
     * 1
     * Sample Input 2:
     *
     * 6
     * 1000 10 1000 10 10 1001
     * Sample Output 2:
     *
     * 5
     * **/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenght = scanner.nextInt();
        Integer[] array = new Integer[lenght];

        //llenando el arreglo
        for (int i = 0; i < lenght; i++) {
            array[i] = scanner.nextInt();
        }

        int max = Collections.max(Arrays.asList(array)); // obtiene el valor mayor del arreglo
        int indice = Arrays.asList(array).indexOf(max);// obtiene el indice del mayop
        System.out.println(max);
        System.out.println(indice);
    }
}
