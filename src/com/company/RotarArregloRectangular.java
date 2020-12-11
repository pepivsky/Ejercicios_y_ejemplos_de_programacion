package com.company;

import java.util.Scanner;

/*
Rotate a rectangle array
Given a rectangle array n×m in size. Rotate it by 90 degrees clockwise, by recording the result into the new array m×n in size.

Input data format

Input the two numbers n and m, not exceeding 100, and then an array n×m in size.

Output data format

Output the resulting array. Separate numbers by a single space in the output.


Sample Input:
3 4
11 12 13 14
21 22 23 24
31 32 33 34

Sample Output:
31 21 11
32 22 12
33 23 13
34 24 14
 */

public class RotarArregloRectangular { //rota un arreglo rectangular hacia la derecha
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int f = scanner.nextInt();
        int c = scanner.nextInt();

        int[][] matrix = new int[f][c];

        for (int i = 0; i < f; i++) { //llenando el arreglo desde consola
            for (int j = 0; j < c; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        /*for (int i = 0; i < f; i++) { //imprimir el arreglo lleno
            System.out.println(Arrays.toString(matrix[i]));
        }*/

        for (int i = 0; i < c; i++) { //imprimiendo el arreglo girado hacia la derecha
            for (int j = f - 1; j >= 0; j--) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }


    }
}
