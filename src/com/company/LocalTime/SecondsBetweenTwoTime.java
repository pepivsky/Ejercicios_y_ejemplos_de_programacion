package com.company.LocalTime;

import java.time.LocalTime;
import java.util.Scanner;
/* //Programa quye muestra la diferencia de segundos entre dos horas dadas
Seconds between two time points
Implement a method that takes two instances of LocalTime and determines how many seconds are between them.


Sample Input:
00:00:01
00:00:05

Sample Output:
4


Sample Input:
02:00:03
00:00:01

Sample Output:
7202
 */
public class SecondsBetweenTwoTime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalTime localTime1 = LocalTime.parse(scanner.next());//obteniendo el time desde un String

        LocalTime localTime2 = LocalTime.parse(scanner.next());

        System.out.println(Math.abs(localTime1.toSecondOfDay() - localTime2.toSecondOfDay()));//Transformando los times en segundos para sacar la diferencia entre ellos, se usa abs por si la diferencia es negativa

    }
}
