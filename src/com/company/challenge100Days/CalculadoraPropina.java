package com.company.challenge100Days;

import java.util.Scanner;

/*Calculadora de propina
Imagina que pediste comida a domicilio (porque debemos quedarnos en casa),
así que crearás un programa al cual ingresarás el valor de los platillos ordenados, obtendrás la suma total de la comida
y calcularás un porcentaje de propina. Recuerda que puedes ingresar una cantidad indeterminada de platillos, indica a tu
programa cuando calcular el resultado final.* */
public class CalculadoraPropina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de platillos");
        int platillos = scanner.nextInt();
        System.out.println("Ingresa el porcentaje que quieres dejar de propina");
        int porcentaje = scanner.nextInt();
        int[] costoPlatillos = new int[platillos];
        int total = 0;
        double propina = 0;
        System.out.println("Ingresa el costo de los platillos");

        for (int i = 0; i < costoPlatillos.length; i++) {
            costoPlatillos[i] = scanner.nextInt();
            total += costoPlatillos[i];
        }
        propina = (double) total * porcentaje / 100;
        System.out.println("La propina que tienes que dejar es: " + propina);
    }
}
