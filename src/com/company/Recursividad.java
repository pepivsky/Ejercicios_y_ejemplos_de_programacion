package com.company;

import java.util.Scanner;

public class Recursividad {
    public static void imprimir(String cadena, int veces) {
        if (veces > 0) {
            System.out.print(cadena + " ");
            imprimir(cadena, veces -1);
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la cadena que quieres repetir");
        String cadena = scanner.nextLine();
        System.out.println("Ingresa el número de veces que quieres que se repita");
        int n = scanner.nextInt();
        imprimir(cadena, n);
    }
}
