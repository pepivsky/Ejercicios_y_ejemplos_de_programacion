package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EjemplosUtiles {


    public static void main(String[] args) {
        //Ordenar un arreglo de manera descendete
        /*Scanner scanner = new Scanner(System.in);
        int tamano = scanner.nextInt();
        Integer[] arreglo = new Integer[tamano];

        for (int i = 0; i < tamano; i++) {
            arreglo[i] = scanner.nextInt();
        }
        //normal
        System.out.println("Orden normal" +Arrays.toString(arreglo));
        //orden Ascendente
        Arrays.sort(arreglo);
        System.out.println("Orden Ascendente: " + Arrays.toString(arreglo));
        //orden descendente
        Arrays.sort(arreglo, Collections.reverseOrder());
        System.out.println("Descendente: " + Arrays.toString(arreglo));*/
/*****************************************************************************/
        //Imprimir la suma de A a B incluyendolos
        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int resultado = 0;

        for (int i = a+1; i <=b; i++) {

            a = a + i;
            System.out.println(resultado);
        }

        System.out.println(a);*/
//Sumar los elementos de un arreglo
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }

        System.out.println(sum);

        //Revisar si algún elemento está en el arreglo
        //Arrays.asList(arrayPrimos).contains(elemento) //el array debe ser Integer
    }
}
