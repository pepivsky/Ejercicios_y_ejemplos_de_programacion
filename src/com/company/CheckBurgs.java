package com.company;
/*
 * Check burgsOpen on JetBrains Academy
 *
 * Write a program that reads the name of a city and checks if the name ends with "burg".
 *
 * Keep in mind, a city can have a short name.
 *
 * The program should output true or false.
 *
 *
 * Sample Input:
 * Augsburg
 *
 * Sample Output:
 * true
 *
 *
 * Sample Input:
 * Saint Petersburg
 *
 * Sample Output:
 * true
 *
 *
 * Sample Input:
 * Tu
 *
 * Sample Output:
 * false
 * ***/
import java.util.Scanner;

public class CheckBurgs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();

        if (city.endsWith("burg")) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }
    }
}
