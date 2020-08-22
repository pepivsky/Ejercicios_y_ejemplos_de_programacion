package com.company.challenge100Days;

import java.util.Scanner;

public class EcuacionesCuadraticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que resuelve ecuaciones cuadráticas del tipo:  'ax² + bx + c = 0'");
        System.out.println("Ingrese los valores de 'a' 'b y 'c' ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int newB = (b < 0) ? b * -1 : b * -1; //le cambia el signo a B
        double x1;
        double x2;

        double determinante;

        //System.out.println(newB);

        determinante = Math.pow(b, 2) + (-4 * a) * c;
        //System.out.println(determinante);

        if (determinante > 0) { // tiene dos soluciones
            x1 = newB - Math.sqrt(determinante);
            double resultadoX1 = x1 / (2 * a);

            x2 = newB + Math.sqrt(determinante);
            double resultadoX2 = x2 / (2 * a);

            System.out.println("La ecuación tiene dos soluciones :)");
            System.out.println("X1 = " + resultadoX1);
            System.out.println("X2 = " + resultadoX2);
        } else if (determinante == 0) { //tiene una solución
            System.out.println("La ecuación tiene una solución :)");
            x1 = newB - Math.sqrt(determinante);
            double resultadoX1 = x1 / (2 * a);
            System.out.println("X = " + resultadoX1);
        } else { //determinante < 0 no tiene solución real
            System.out.println("La ecuación no tiene soluciones reales :(");
        }


    }
}
