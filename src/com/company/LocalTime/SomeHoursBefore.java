package com.company.LocalTime;

import java.time.LocalTime;
import java.util.Scanner;
/* Restando horas y minutos a un objeto LocalTime
Some hours and minutes ago
Write a program that reads a point in time and prints another point in time at the specified number of hours and minutes before the given one.

Input data format

The first line contains a point in time in hours:minutes format. The second line contains two numbers: hours and minutes separated by a space.

Output data format

The single output line should contain a point in time before the input time in the same format.


Sample Input:
18:10
2 30

Sample Output:
15:40
 */
public class SomeHoursBefore {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine();

        int hourMinus = scanner.nextInt(); //pidiendo los datos que le vamos a restar
        int minMinus = scanner.nextInt();

        LocalTime localTime = LocalTime.parse(time);//creando la hora a partir del string

        System.out.println(localTime.minusHours(hourMinus).minusMinutes(minMinus)); //restando la hora y minutos y mostrandolos
    }
}
