package com.company.localDate;

import java.time.LocalDate;
import java.util.Scanner;
/*
Write a program that prints the n-th day from the end of a month.

The program must read a year, a month and an offset from the end of the month and output the date.

 Report a typo
Sample Input 1:

2017 1 1
Sample Output 1:

2017-01-31

Programa que obtiene una fecha contando hacia atras a partir del dia, ejemplo 2017 1 1 seria 2017-1-31 (el ultimo 1 es el ultimo dia)
ejemplo2: 2017-1-2 = 2017-1-30
 */
public class FechaDesdeUltimoDiaDelMes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt(); //obteniendo los datos
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        LocalDate date = LocalDate.of(year, month, day); //creando fecha con los datos

        int lenOfMonth = date.lengthOfMonth(); //obteniendo el total de dias del mes

        LocalDate dateFromLastDay = LocalDate.of(year, month, lenOfMonth - (day - 1)); //nueva fecha es igual al total de dias menos 1 porque 31 es el primer dia
        System.out.println(dateFromLastDay);
    }
}
