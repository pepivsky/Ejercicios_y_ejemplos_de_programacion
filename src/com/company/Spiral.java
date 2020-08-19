package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        int a = 0;
        int b = n - 1;
        int valor = 1;


        for (int j = 0; j < array.length; j++) {
            
            //llenar fila superior
            for (int i = a; i <= b; i++) {
                array[a][i] = valor++;
            }

            //llenar columna del extremo derecho
            for (int i = a + 1; i <= b; i++) {
                array[i][b] = valor++;
            }

            //llenar la fila inferior de derecha a izquierda
            for (int i = b -1 ; i >= a; i--) {
                array[b][i] = valor++;
            }

            //llena la columna del extremo izquerdo de abajo hacia arriba
            for (int i = b - 1; i >= a + 1 ; i--) {
                array[i][a] = valor++;
            }

            a++;
            b--;
        }

        /*//formato de array
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println();*/

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length ; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        //otra solucion

        /*
        *
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] spiral = new int[n][n];
        int value = 1;
        int minCol = 0;
        int maxCol = n - 1;
        int minRow = 0;
        int maxRow = n - 1;

        while (value <= n * n) {
            for (int i = minCol; i <= maxCol; i++) {
                spiral[minRow][i] = value;
                value++;
            }
            for (int i = minRow + 1; i <= maxRow; i++) {
                spiral[i][maxCol] = value;
                value++;
            }
            for (int i = maxCol - 1; i >= minCol; i--) {
                spiral[maxRow][i] = value;
                value++;
            }
            for (int i = maxRow - 1; i >= minRow + 1; i--) {
                spiral[i][minCol] = value;
                value++;
            }
            minCol++;
            minRow++;
            maxCol--;
            maxRow--;
        }

        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral.length; j++) {
                System.out.print(spiral[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
        *
        *
        *
        * **/


        



    }
}
