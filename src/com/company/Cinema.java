package com.company;

import java.util.*;

public class Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lengthF = scanner.nextInt();
        int lengthC = scanner.nextInt();
        int contador = 1;
        int k;
        ArrayList<Integer> arrayList = new ArrayList<>();

        int[][] matrix = new int[lengthF][lengthC];

        //llenar la matriz
        for (int i = 0; i < lengthF; i++) {
            for (int j = 0; j < lengthC; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        k = scanner.nextInt();

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


        int aux = 0;
        //si la fila es 1



        //revisa la fila 1
        if (lengthF == 1) {
            System.out.println("Entrando if fila = 1");
            for (int i = 0; i < lengthF; i++) {
                for (int j = 0; j < matrix[0].length-1; j++) {
                    if (matrix[i][j] == 0) {
                        if (matrix[i][j + 1] == matrix[i][j]) {
                            contador++;
                            if (contador == k) { //estaba en ==
                                aux = i + 1;
                                arrayList.add(aux);
                            }
                        }
                    } else {
                        contador = 1;
                    }
                }
            }

        } else {
            if (k == 1) {
                for (int i = 0; i < lengthF; i++) {
                    for (int j = 0; j < matrix[1].length; j++) {
                        if (matrix[i][j] == 0) {
                            aux = i + 1;
                            arrayList.add(aux);
                        }
                    }
                }

            } else {
                for (int j = 0; j < lengthF; j++) {
                    for (int i = 0; i < matrix[1].length - 1; i++) { //recorre la fila
                        if (matrix[j][i] == 0) {
                            if (matrix[j][i + 1] == matrix[j][i]) {
                                contador++;
                                if (contador == k) { //estaba en ==
                                    aux = j + 1;
                                    arrayList.add(aux);
                                }
                            }
                        } else {
                            contador = 1;
                        }
                    }
                    contador = 1;
                    //System.out.println(contador);
                }
            }
        }

        //arrayList.add(3);


        //System.out.println(contador); //deberia ser 2
        System.out.println(arrayList);
        if (arrayList.isEmpty()) {
            System.out.println("0");
        } else {
            System.out.println(arrayList.get(0));
        }

        //System.out.println(Arrays.toString(matrix[1])); // imprime el arreglo de unos
    }
}
