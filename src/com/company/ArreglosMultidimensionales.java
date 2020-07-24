package com.company;

import java.util.Scanner;

public class ArreglosMultidimensionales {

    public static void main(String[] args) {
            /*
Given an odd number n, not exceeding 15. Create a two-dimensional array (matrix)
from n×n elements, by filling it with "." symbols (each element of the matrix is
a string containing a single symbol). Then fill the middle row of the matrix,
the middle column, and the main and the secondary diagonals with the "*" symbols.
As a result, all "*"s in the array must form the star figure. Output this matrix;
elements of the array should be space separated.

Sample Input 1:

5
Sample Output 1:

* . * . *
. * * * .
* * * * *
. * * * .
* . * . *

    * */
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int mitad = number / 2;
        String array [][] = new String[number][number];

        int contador = array.length-1;
        //Llenar con puntos
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++)
                array[x][y] = ".";

        }

        //Llenar linea central vertical
        System.out.println(mitad);
        for (int i = 0; i < array.length; i++) {
            array[i][mitad] = "*";
        }
        //Llenar linea central horizontal
        for (int i = 0; i < array.length; i++) {
            array[mitad][i] = "*";
        }
        //Llenar diagonal 1
        for (int i = 0; i < array.length; i++) {
            array[i][i] = "*";
        }

        System.out.println(contador);
        //Llenar diagonal 2
        for (int i = 0; i < array.length; i++) {
            array[i][contador] = "*";
            contador --;
        }


        //System.out.println(Arrays.toString(array));
        //Imprimir arreglo
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++)
                System.out.print(array[x][y] + " ");
            System.out.println();

        }
    }
}
