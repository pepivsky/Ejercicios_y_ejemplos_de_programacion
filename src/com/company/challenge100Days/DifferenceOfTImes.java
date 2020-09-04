package com.company.challenge100Days;

import java.util.Scanner;
/**
 * Find how many seconds passed between the two moments of time on the same day.
 *
 * You are given the integer values representing these moments: hours, minutes and seconds for each of them. It is guaranteed that the earlier moment goes first in the input.
 *
 * Input data format
 *
 * The program gets the input of six integers: three defining the first moment of time in hours, minutes, seconds, and the other three defining the second one.
 *
 * For example, six numbers 1, 2, 30, 15, 21, 1 will represent two moments of time: 1:02:30 am and 3:21:01 pm (or just 15:21:01).
 *
 * Output data format
 *
 * Just one number: seconds between these two moments of time. It's 51511 (14 hours, 18 minutes and 31 seconds) in our example.
 *
 *  Report a typo
 * Sample Input 1:
 *
 * 1
 * 1
 * 1
 * 2
 * 2
 * 2
 * Sample Output 1:
 *
 * 3661
 * Sample Input 2:
 *
 * 1
 * 2
 * 30
 * 1
 * 3
 * 20
 * Sample Output 2:
 *
 * 50
 * */
public class DifferenceOfTImes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int s1 = scanner.nextInt();

        int time1 = (h1 * 3600) + (m1 * 60) + s1;

        int h2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int s2 = scanner.nextInt();

        int time2 = (h2 * 3600) + (m2 * 60) + s2;

        /*Math.max(time1, time2);
        Math.min(time1, time2);*/
        System.out.println(Math.max(time1, time2) - Math.min(time1, time2));
    }
}
