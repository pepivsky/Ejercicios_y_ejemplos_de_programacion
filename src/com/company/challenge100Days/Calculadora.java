package com.company.challenge100Days;

import java.util.Scanner;
/**
 * Calculadora
 * ¿Necesitamos nuestra Casio cuando tenemos Python? Yo la verdad todavía amo a mi calculadora de bolsillo,
 * pero también amo hacer programas.El reto del día de hoy es crear una calculadora básica que reemplace a
 * nuestra Casio. Crea un programa que tome un número, un operador, y otro número y realice el cálculo correcto.
 * Ejemplo:```
 * calculadora(2, “+”, 2) -> 4
 * calculadora(4, “/”, 2) -> 2
 * **/

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora :) \nIngresa la operación ejemplo: 2 + 3 ");
        double num1 = scanner.nextDouble();
        String operation = scanner.next();
        double num2 = scanner.nextDouble();
        double resultado;

        switch (operation) {
            case "+":
                resultado = num1 + num2;
                System.out.println(resultado);
                break;
            case "-":
                resultado = num1 - num2;
                System.out.println(resultado);
                break;
            case "*":
                resultado = num1 * num2;
                System.out.println(resultado);
                break;
            case "/":
                resultado = num1 / num2;
                System.out.println(resultado);
                break;
        }


    }
}
