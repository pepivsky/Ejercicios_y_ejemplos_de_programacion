package com.company.localDate;

import java.time.LocalDate;
import java.util.Scanner;
/* The last day of a month

We normally speak of a day by addressing a month, for example, August 30.
Another way to indicate a day is to give an order number to each day in a year. Then we could say, for example, "242nd day of the year".

Write a program that reads a year and the number of a day in this year, and checks if the day is the last day of a month or not.

The program must output either "true" or "false".

Programa que te dice si un dia es el ultimo del mes
 */
public class UtlimoDiaDelMes {

    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        //pidiendo el año y el dia por consola
        int year = scanner.nextInt();
        int dayOfYear = scanner.nextInt();

        LocalDate date = LocalDate.ofYearDay(year, dayOfYear); //obteniendo la fecha a partir del dia y el anio por ejemplo 2017 365(365 es el 31 de diciembre)

        int day = date.getDayOfMonth(); //obtniendo el dia del mes de esa fecha

        int lenOfYear = date.lengthOfYear(); //obteniendo los dias totales de un anio para saber si el anio es bisisesto o no

        if (lenOfYear == 365 & (day == 31 || day == 30 || day == 28)) { //si el anio no es bisisesto
            System.out.println(true);
        } else if (lenOfYear == 366 & (day == 31 || day == 30 || day == 29)) { //si el anio es bisiesto
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
