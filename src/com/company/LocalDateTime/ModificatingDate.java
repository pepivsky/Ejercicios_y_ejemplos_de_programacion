package com.company.LocalDateTime;

import java.time.LocalDateTime;
import java.util.Scanner;
/*
Add days and subtract hours
Write a program that changes the given point of time: adds a certain number of days and subtracts a few hours.

Input and output date-time like this "2017-12-31T22:30".

Input data format

The single line containing date-time and two numbers: days to add and hours to subtract. Input elements are separated by spaces.

Output data format

The output must contain only a date-time in the specified format.


Sample Input:
2017-12-31T22:30 10 5

Sample Output:
2018-01-10T17:30

 */
public class ModificatingDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime date = LocalDateTime.parse(scanner.next());
        int daystoAdd = scanner.nextInt();
        int hourstoSustract = scanner.nextInt();

        System.out.println(date.plusDays(daystoAdd).minusHours(hourstoSustract));
    }
}
