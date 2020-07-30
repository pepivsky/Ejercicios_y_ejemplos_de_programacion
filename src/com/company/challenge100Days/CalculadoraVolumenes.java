package com.company.challenge100Days;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Calculadora de volúmenes, el usuario debe elegir entre Cilindro, Cubo y Esfera
 * Las matemáticas son base fundamental de la lógica y programación, por eso es importante practicarlas
 * constantemente. Un cilindro es un cuerpo geométrico que requiere de varias fórmulas, aplícalas en un
 * programa que reciba datos como su altura y radio de las bases para mostrar el resultado acotado a un decimal.
 * */
public class CalculadoraVolumenes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0"); //para que muestre solo 1 decimal
        System.out.println("Calculadora de vólumenes :) \n1-cilcindro 2-cubo 3-esfera");
        int opcion = scanner.nextInt();
        double volumen;
        double radio;
        double altura;
        double lado;

        switch (opcion) {
            case 1: //cilindro
                System.out.println("Ingresa la altura");
                altura = scanner.nextDouble();
                System.out.println("Ingresa el radio de una de sus bases");
                radio = scanner.nextDouble();
                volumen = Math.PI * Math.pow(radio, 2) * altura;
                System.out.println("El volumen del cilindro es: " + df.format(volumen));
                break;
            case 2: //cubo
                System.out.println("Ingresa la medida de un lado");
                lado = scanner.nextInt();
                volumen = Math.pow(lado, 3);
                System.out.println("El volumen del cubo es: " + df.format(volumen));
                break;
            case 3: //esfera
                System.out.println("Ingresa el radio de la esfera:");
                radio = scanner.nextDouble();
                volumen = (Math.PI * 4) * Math.pow(radio, 3) / 3;
                System.out.println("El volumen de la esfera es: " + df.format(volumen));
                break;
            default: //cualquier otra opción
                System.out.println("Opción no válida :(");
                break;
        }
    }
}
