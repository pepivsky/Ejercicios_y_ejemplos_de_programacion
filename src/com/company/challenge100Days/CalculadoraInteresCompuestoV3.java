package com.company.challenge100Days;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraInteresCompuestoV3 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Calculadora de capital final (considerando un interes del 4%)");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu captial incial");
        int cInicial = scanner.nextInt();
        double cFinal;
        System.out.println("Ingresa los meses");
        int meses = scanner.nextInt();
        double cFinalB;

        cFinal = Math.pow(1.04, (meses * 0.08333333333)) * cInicial;//Interés del 4%

        cFinalB = Math.pow(1.03, (meses * 0.08333333333)) * cInicial;//Interés del 3%
        System.out.println("El capital final con el banco A en " + meses + " meses" + " sería de: " + df.format(cFinal));
        System.out.println("El capital final con el banco B en " + meses + " meses" + " sería de: " + df.format(cFinalB));
    }
}
