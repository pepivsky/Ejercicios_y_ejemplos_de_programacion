package com.company.challenge100Days;

import java.util.Scanner;

/**
 * Calculadora v2
 * Te diste cuenta de que muchas veces hacemos cálculos que son con más de dos valores,
 * quiero que crees el algoritmo para programar una calculadora a la que le puedas agregar tantos números
 * como tú requieras, deberá servir para adiciones y multiplicaciones
 * */

public class CalculadoraV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe 1 para suma o 2 para multiplicación");
        int opcion = scanner.nextInt();
        int num;
        int resultado = 0;
        int resultadoMult = 1;

        switch (opcion) {
            case 1: //suma
                do {
                    System.out.println("Escribe un un número para sumar o escribe 0 para salir");
                    num = scanner.nextInt();
                    resultado += num;
                }while (num != 0);
                System.out.println("El  resultado es: " + resultado);
                break;
            case 2: //multiplicación
                do {
                    System.out.println("Escribe un un número para multiplicar o escribe 0 para salir");
                    num = scanner.nextInt();
                    if (num == 0) {
                        break;
                    }
                    resultadoMult *= num;
                }while (true);
                System.out.println("El  resultado es: " + resultadoMult);
                break;

            default:
                System.out.println("opción no válida");
                break;
        }
    }
}
