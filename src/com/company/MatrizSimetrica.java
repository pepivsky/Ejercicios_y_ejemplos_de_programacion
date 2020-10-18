package com.company;

import java.util.Scanner;
/**
 * Given the number n, not exceeding 10, and a matrix of size n × n.
 *
 * Check whether this matrix is symmetric in relation to the main diagonal. Output the word “YES”, if it is symmetric and the word “NO” otherwise.
 *
 *  Report a typo
 * Sample Input 1:
 *
 * 3
 * 0 1 2
 * 1 2 3
 * 2 3 4
 * Sample Output 1:
 *
 * YES
 * */
public class MatrizSimetrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        int counter = 0;

        //llenando la matriz
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        //revisando si es simetrica
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] == matrix[j][i]) { //si som iguales se incrementa el contador
                    counter++;
                }
            }
        }
        //si todos los elementos de la matriz son iguales se imprime YES
        System.out.println(counter >= size * size ? "YES" : "NO");
    }
}
