package com.company.challenge100Days;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class OrdenarLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el tamaño de la lista ");
        int elements = scanner.nextInt();
        Integer[] array = new Integer[elements];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        //Ordenar de menor a mayor
        Arrays.sort(array);
        System.out.println("De menor a mayor: " + Arrays.toString(array));
        //Ordenar de mayor a menor
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("De mayor a menor: " + Arrays.toString(array));
    }
}
