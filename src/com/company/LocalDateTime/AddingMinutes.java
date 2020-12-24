package com.company.LocalDateTime;

import java.time.LocalDateTime;
import java.util.Scanner;
/* Agregando minutos a un dateTime y mostrandolo en un formato con dia del anio
Adding N minutes
Write a program that adds N minutes to a given date and time and prints out the resulting year, day of the year, hours and minutes.

The input date-time should look like "2017-12-31T22:30:15", the result date must be similar to "2018 139 19:50:15" (year, day of the year, hours, minutes, seconds).

If the result has no seconds, the program must not print them.

Input data format

Two lines: the first one containing date-time, the second one containing a number of minutes to add.

Output data format

The single line must contain a string with the result.


Sample Input:
2017-12-31T22:30:15
200000

Sample Output:
2018 139 19:50:15


Sample Input:
2017-05-05T15:20
20

Sample Output:
2017 125 15:40


Sample Input:
2017-01-01T01:01:01
5000000

Sample Output:
2026 186 06:21:01
 */
public class AddingMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDateTime localDateTime = LocalDateTime.parse(scanner.nextLine());//obteniendo el dateTime
        localDateTime = localDateTime.plusMinutes(scanner.nextInt()); //sumandole minutos

        int days = localDateTime.getDayOfYear(); //obteniendo a partir de la nueva fecha el dia del anio contando desde el inicio

        String newDate = localDateTime.toString().replaceAll("\\b-.{6}", " " + days + " ");//reemplazando para crear la fecha con el formato espicifico

        System.out.println(newDate);
    }
}
