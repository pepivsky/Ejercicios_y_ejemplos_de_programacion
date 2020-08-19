package com.company.challenge100Days;

import java.util.Scanner;
/**
 * El Teorema de Pitagoras nos puede ayudar a encontrar la distancia entre dos puntos en un plano. Crea una calculadora que determine la distancia dado dos puntos. Por ejemplo,
 *
 * Punto A = (3, 4)
 * Punto B = (5, 7)
 * Distancia = 3.605551
 * ***/
public class DistanciaEntreDosPuntos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aX, aY;
        int bX, bY;
        double resultado;

        System.out.println("Ingresa las coordenadas del punto 'a'");
        aX = scanner.nextInt();
        aY = scanner.nextInt();
        System.out.println("Ingresa las coordenadas del punto 'b'");
        bX = scanner.nextInt();
        bY = scanner.nextInt();

        //formula:  d = √(xb - xa)2 + (yb - ya)2
        resultado = Math.sqrt(Math.pow(bX - aX, 2) + Math.pow(bY - aY, 2));
        System.out.println("Distancia: " + resultado);
    }
}
