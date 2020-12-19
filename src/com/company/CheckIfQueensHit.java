package com.company;

import java.util.Scanner;
/* Programa que te dice si dos reinas se golpean entre si en un tablero de ajedrez
Queens
You are given coordinates of two queens on a chess board. Find out whether or not they hit each other.

Input data format

Four integer numbers x1,y1,x2,y2.

Output data format

Type "YES" (uppercase) if they hit each other or "NO" if they don't.

You may need a method that calculates the absolute value of the number, so here it is:

Math.abs(n)
 */
public class CheckIfQueensHit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean hit = false;

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        if (x1 == x2) {
            hit = true;
        } else if (y1 == y2) {
            hit = true;
        } else if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            hit = true;
        } else {
            hit = false;
        }

        System.out.println(hit ? "YES" : "NO");
    }
}
