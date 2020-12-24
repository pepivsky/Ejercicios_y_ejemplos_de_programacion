package com.company.LocalDateTime;

import java.time.LocalDateTime;
import java.util.Scanner;

/* Programa que resta horas y suma minutos a un objeto LocalDateTime

Subtracting hours and adding minutes
The problem statement
Write a program that subtracts N hours and adds M minutes to a date-time pair.

Input data format
The first line contains a date-time pair (year-month-dayThours:minutes). The second line contains two numbers separated by a space: hours to subtract and minutes to add.

Output data format
A single line with a date-time pair (year-month-dayThours:minutes).

Sample Input:
2017-12-15T11:11
1 58

Sample Output:
2017-12-15T11:09


Sample Input:
2016-11-22T00:00
5000 300010

Sample Output:
2016-11-22T00:10
 */
public class RestarHorasYSumarMinutos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dateTime = scanner.next(); //pidiendo datos
        int hoursToSubtract = scanner.nextInt();
        int minutesToAdd = scanner.nextInt();

        LocalDateTime localDateTime = LocalDateTime.parse(dateTime); //creando el dateTime a partir de un String
        localDateTime = localDateTime.minusHours(hoursToSubtract);//restando horas
        localDateTime = localDateTime.plusMinutes(minutesToAdd);//sumando minutos

        System.out.println(localDateTime);
    }
}
