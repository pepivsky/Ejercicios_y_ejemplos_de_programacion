package com.company;

import java.util.Arrays;

public class BusquedaEnArreglo {
    public static void main(String[] args) {
        int[] array = {10 , 9, 8 , 7};

        //hay que ordenar el arreglo para que la busqueda funcione
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int indice = Arrays.binarySearch(array,0, array.length, 10);
        System.out.println(indice);
    }
}
