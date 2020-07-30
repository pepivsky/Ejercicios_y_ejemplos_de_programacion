package com.company.challenge100Days;

import java.text.DecimalFormat;
import java.util.Scanner;

/**Reto 21 ¿Cuánto vas a ahorrar?
 * "El interés compuesto te sirve para generar más dinero gracias a los intereses que generas,
 * es decir, hace que el valor que se paga por intereses se vaya aumentando mes a mes,
 * por que el dinero sobre el cuál se hace el cálculo del interés se incrementa cada vez que se liquidan
 * los respectivos intereses que ganaste el mes previo.
 * Crea una calculadora que te diga cuánto vas a tener en 6 meses, 1 año y 2 años al ahorrar 100 dólares
 * con una tasa de interés a tu favor del 4%
 * */

public class CalculadoraInteresCompuesto {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Calculadora de capital final (condiserando un interes del 4%)");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu captial incial");
        int cInicial = scanner.nextInt();
        double cFinal = 0;
        System.out.println("Ingresa una opción para el tiempo 1-(6 meses) 2-(1 año) 3-(2 años)");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1: //6 meses = 0.5
                cFinal = Math.pow(1.04, 0.5) * cInicial;
                break;
            case 2: //1 año = 1
                cFinal = Math.pow(1.04, 1) * cInicial;
                break;
            case 3: //2 años = 2
                cFinal = Math.pow(1.04, 2) * cInicial;
                break;
            default:
                System.out.println("Opción incorrecta :(");
                break;
        }
        System.out.println("Tu capital final será de: " + df.format(cFinal));
    }
}
