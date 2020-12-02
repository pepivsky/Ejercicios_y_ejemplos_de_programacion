package com.company.localDate;

import java.time.LocalDate;
import java.util.Scanner;
/*
30 years before and after
Write a program that reads a date from the standard input and prints two dates: 30 years before and after compared to the given date.


Sample Input:
2017-06-03

Sample Output:
1987-06-03
2047-06-03


Sample Input:
2017-04-28

Sample Output:
1987-04-28
2047-04-28
 */
class SumarAnios {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String stringDate = scanner.nextLine(); //obteniendo la fecha en el formato : 2017-06-03

        LocalDate date = LocalDate.parse(stringDate); //parseando String a fecha

        LocalDate beforeDate = date.minusYears(30); //30 anios antes
        LocalDate afterDate = date.plusYears(30); //30 anios depues

        System.out.println(beforeDate);
        System.out.println(afterDate);
    }
}
