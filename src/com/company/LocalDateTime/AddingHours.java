package com.company.LocalDateTime;

import java.time.LocalDateTime;
import java.util.Scanner;
/* Programa que suma 11 horas a un objeto localDateTime

Write a program that reads date-time, adds 11 hours to it and then prints out the resulting date.

The input date-time format should be, for example, "2017-12-31T22:30". The resulting date then must be "2018-01-01".


Sample Input:
2017-12-31T22:30

Sample Output:
2018-01-01

 */
public class AddingHours {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long hoursToAdd = 11L;
        LocalDateTime localDateTime = LocalDateTime.parse(scanner.nextLine());
        System.out.println(localDateTime.plusHours(hoursToAdd).toLocalDate());
    }

}
