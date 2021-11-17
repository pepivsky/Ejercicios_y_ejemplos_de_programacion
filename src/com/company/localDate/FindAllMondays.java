package com.company.localDate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;
/* Programa que imprime todos los lunes del mes

Find all mondays
Write a program that reads a year and the number of a month (1-12) and prints the dates of all Mondays of this month in the correct order (from the first to the last).


Sample Input:
2017 1

Sample Output:
2017-01-02
2017-01-09
2017-01-16
2017-01-23
2017-01-30


 */
public class FindAllMondays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate localDate = LocalDate.of(scanner.nextInt(), scanner.nextInt(), 1);
        LocalDate lastDayOfMonth = LocalDate.from(localDate).withDayOfMonth(localDate.lengthOfMonth());

        for (LocalDate date = localDate; date.isBefore(lastDayOfMonth); date = date.plusDays(1)) {
            if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
                System.out.println(date);
            }
        }
    }
}
