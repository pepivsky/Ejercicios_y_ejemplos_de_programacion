package com.company.localDate;

import java.time.LocalDate;
import java.util.Scanner;
/* programa que obtiene el dia del anio y dia del mes de una fecha
Getting information on a day
Write a program that reads a date from the standard input and output the following information on it:

1) number of the day in the year;

2) the number of the day in the month.


Sample Input:
2017-06-03

Sample Output:
154 3


Sample Input:
2017-04-28

Sample Output:
118 28

 */
public class DayOfYearAndMonth {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDate localDate = LocalDate.parse(scanner.nextLine());
        int dayOfYear = localDate.getDayOfYear();
        int dayOfMonth = localDate.getDayOfMonth();

        System.out.println(dayOfYear + " " + dayOfMonth);
    }
}
