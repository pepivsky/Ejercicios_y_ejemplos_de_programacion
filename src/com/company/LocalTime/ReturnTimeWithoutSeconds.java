package com.company.LocalTime;

import java.time.LocalTime;
import java.util.Scanner;
/* Programa que regresa la fecha a partir de un string pero sin los segundos
Return time without seconds
Write a program that reads a point in time and outputs the same time without seconds.

Note: the input time may not contain seconds.


Sample Input:
18:10:55

Sample Output:
18:10


Sample Input:
19:30:30

Sample Output:
19:30

 */
public class ReturnTimeWithoutSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String time = scanner.next();

        LocalTime localTime = LocalTime.parse(time); //pareseando la hora desde un string

        System.out.println(localTime.withSecond(0));//imprimiendo la hora sin los segundos
    }
}
