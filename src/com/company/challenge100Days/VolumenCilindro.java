package com.company.challenge100Days;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VolumenCilindro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        double volumen;

        System.out.println("Programa que calcula el volumen de un cilindro");
        System.out.println("Ingresa la altura");
        double altura = scanner.nextDouble();
        System.out.println("Ingresa el radio de una de sus bases");
        double radio = scanner.nextDouble();

        volumen = Math.PI * Math.pow(radio, 2) * altura;
        System.out.println("El volumen del cilindro es :" + df.format(volumen));
    }
}
