package com.company;

import java.util.Scanner;
/*
* Good rest on vacation
Write a program that will help people who are going on vacation. The program should calculate the total required sum (e.g. $) of money to have a good rest for a given duration.

There are four parameters which have to be considered:

duration in days
total food cost per day
one-way flight cost
cost of one night in a hotel (the number of nights equal duration minus one)
Read values of these parameters from the standard input and then print the result.

Hint


Sample Input:
7 30 100 40

Sample Output:
650


* */
public class GoodRest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int foodCost = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int costHotel = scanner.nextInt();

        System.out.println(foodCost * days + flightCost * 2 + costHotel * (days - 1));

    }
}