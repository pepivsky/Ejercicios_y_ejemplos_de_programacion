package com.company.localDate;

import java.time.LocalDate;
import java.util.Scanner;

/* Programa que revisa si un dia de una fecha dada es el primero del mes
The first day of a month or not
We are used to talking about days in relation to their position in a month, for example, February 22. But as we've already mentioned, there's another way to address a day: to give an order number to each day in a year. Then we could say, for example, "53rd day of the year".

Write a program that reads a year and the order number of a day, and checks if this day is the first day of a month or not.

The program must output either "true" or "false".


Sample Input:
2017 31

Sample Output:
false
 */

public class CheckIfDayIsFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt(); //obteniendo la entrada del teclado
        int day = scanner.nextInt();

        LocalDate date = LocalDate.ofYearDay(year, day); //creando la fecha a partir de un dia del año

        System.out.println(date.getDayOfMonth() == 1); //obtener el dia desde la fecha e imprimiendo si es el primero
    }
}
