package com.company.LocalTime;

import java.time.LocalTime;
import java.util.Scanner;

/*Programa que crea una instancia de LocalTime (horas, minutos y segundos) a partir de los segundos desde el inicio del dia
Seconds since start of a day
Write a program that reads a number of seconds from the start of a day and prints the current time.

If the resulting time has zero seconds, do not output them.


Sample Input:
12345

Sample Output:
03:25:45


Sample Input:
60000

Sample Output:
16:40
 */
public class SecondsForATime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seconds = scanner.nextInt(); //pidiendo los segundos

        LocalTime localTime = LocalTime.ofSecondOfDay(seconds); //creando la hora del dia (hora, minutos y segundos) pasandole los segundos

        System.out.println(localTime);

    }
}
