package com.company;

import java.util.Scanner;

public class MayorDe3Nums {
    static final int NUMBER_1 = 1;
    static final int NUMBER_2 = 2;
    static final int NUMBER_3 = 3;

    public static int getNumberOfMaxParam(int a, int b, int c) {
        // write a body here
        if (a >= b && a >= c) {
            return NUMBER_1;
        } else if (b >= a && b >= c) {
            return NUMBER_2;
        } else {
            return NUMBER_3;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}
