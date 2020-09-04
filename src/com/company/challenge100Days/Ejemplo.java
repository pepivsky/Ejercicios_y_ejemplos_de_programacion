package com.company.challenge100Days;

import java.util.Arrays;
import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos prodcutos quiere ingresar");
        int n = scanner.nextInt();
        int[] productos = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingresa el precio del producto: " + i);
            productos[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(productos));
    }
}
