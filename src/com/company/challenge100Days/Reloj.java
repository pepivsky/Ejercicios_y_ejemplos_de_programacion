package com.company.challenge100Days;

import java.util.Scanner;

public class Reloj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que te dice cuantos segundos hay en un tiempo ingresado");
        System.out.println("Ingresa las horas");
        int hora = scanner.nextInt();
        System.out.println("Ingresa los minutos");
        int minuto = scanner.nextInt();
        int segundosM = 0;
        int segundosH = 0;

        segundosM = minuto * 60;
        segundosH = hora * 3600;

        System.out.println("En " + hora + " horas" + " con " + minuto + " minutos " + "hay: " + (segundosH + segundosM) + " segundos");



    }
}
