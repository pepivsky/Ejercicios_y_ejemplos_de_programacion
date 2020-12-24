package com.company.LocalDateTime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
/* Programa que crea un objeto dateTime desde la entrada de teclado e imprime los dias que han pasado desde el comienzo de anio de la fecha ingresada
The passed hours since the beginning of year
The problem statement
Write a program that reads a date-time pair and calculates how many hours have passed since the beginning of the year (1st January, 00:00).

Input data format
The first line contains a date-time pair in the format year-month-dayThour:minute:second.

Output data format
The line containing an integer number.
Sample Input:
2017-12-31T23:59:59

Sample Output:
8759
 */
public class HorasTranscurridasDesdeComienzoDeAnio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDateTime localDateTime = LocalDateTime.parse(scanner.next()); //parseando String a dateTime
        LocalDateTime beginningOfYear = localDateTime.withDayOfYear(1).withHour(0).withMinute(0).withSecond(0);//creando la nueva fecha

        System.out.println(beginningOfYear.until(localDateTime, ChronoUnit.HOURS));//until devuelve la cantidad de tiempo entre dos fechas, en la unidad especificada
    }
}
