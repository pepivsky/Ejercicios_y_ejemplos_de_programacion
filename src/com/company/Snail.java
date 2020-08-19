package com.company;

import java.util.Scanner;
/**
 * Snail creeps up the vertical pole of height H feet. It goes A feet up per day, and B feet down per night. In which day the snail will reach the top of the pole?
 *
 * Input data format
 *
 * On the input the program receives non-negative integers H, A, B, where H > B and A > B. Every integer does not exceed 100.
 *
 * Sample Input 1:
 *
 * 10
 * 3
 * 2
 * Sample Output 1:
 *
 * 8
 * Sample Input 2:
 *
 * 20
 * 7
 * 3
 * Sample Output 2:
 *
 * 5
 * */
public class Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        float distance = a - b;
        System.out.println(Math.round(Math.ceil((h - a) / distance + 1)));
    }
}
