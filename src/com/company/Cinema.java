package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lengthF = scanner.nextInt();
        int lengthC = scanner.nextInt();
        int contador = 1;

        int[][] matrix = new int[lengthF][lengthC];

        //llenar la matriz
        for (int i = 0; i < lengthF; i++) {
            for (int j = 0; j < lengthC; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        //imprimiendo
        for (int i = 0; i < matrix.length; i++) {

            System.out.println(Arrays.toString(matrix[i]));
        }

        //revisa cuantos elemwntos repetidos consecutivos hay en la fila 0
       /*for (int i = 0; i < matrix[0].length-1; i++) {
            if (matrix[0][i+1] == matrix[0][i]) {
                contador++;
            }
       }*/
        //revisa la fila 1
        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix[1].length - 1; i++) {
                if (matrix[j][i + 1] == matrix[j][i]) {
                    contador++;
                }
            }
        }


        System.out.println(contador); //deberia ser 2

        //System.out.println(Arrays.toString(matrix[1])); // imprime el arreglo de unos
    }
}
