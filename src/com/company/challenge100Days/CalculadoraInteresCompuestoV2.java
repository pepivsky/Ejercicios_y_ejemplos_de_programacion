package com.company.challenge100Days;

import java.text.DecimalFormat;
import java.util.Scanner;
/**Reto #23:
 *¿Puedo ahorrar otros periodos de tiempo?
 * Tu banco quiere permitirte ahorrar en nuevos intérvalos de tiempo que tú eleijas,
 * agrega la funcionalidad a tu calculadora de interés compuesto de poner una cantidad de meses
 * de ahorro variable
 * */

public class CalculadoraInteresCompuestoV2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Calculadora de capital final (considerando un interes del 4%)");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu captial incial");
        int cInicial = scanner.nextInt();
        double cFinal;
        System.out.println("Ingresa los meses");
        int meses = scanner.nextInt();

        cFinal = Math.pow(1.04, (meses * 0.08333333333)) * cInicial;
        System.out.println("El capital final en " + meses + " meses" + " sería de: " + df.format(cFinal));
    }
}
