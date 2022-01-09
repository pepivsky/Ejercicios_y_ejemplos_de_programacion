package com.company.regexExamples;

import java.util.Scanner;
/* programa que revisa si un numero de tarjeta es visa, masterCard o american express
Card name validation and identification
Write a program that uses regular expressions to check whether the input card number is valid and identifies the card network name.

The input must consist only of numbers. Your program must take a string as an input and print the name of the card network as output, choosing from the set of names specified below, or the message: "Card number does not exist”.

Card networks: Visa, Mastercard, American Express.

A Visa card starts with 4 and has the length of 16 digits.
A MasterCard starts with the numbers from 51 to 55, or the numbers 2221 to 2720. All have 16 digits.
American Express card numbers start with 34 or 37 and have 15 digits.

Sample Input:
4235 2345 6543 1234

Sample Output:
Visa

 */
public class ChekCard {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String numbers = scn.nextLine();
        String card = numbers.replaceAll("\\s", "");
        // put your code here
        String visaRegex = "4\\d{3}\\d{4}\\d{4}\\d{4}";
        // put your code here
        String masterCardRegex = "(2221|2720)\\d{12}";
        // put your code here
        String americanExpressRegex = "3[47]\\d{13}";

        if (card.matches(visaRegex)) {
            System.out.println("Visa");
        } else if (card.matches(masterCardRegex)) {
            System.out.println("MasterCard");
        } else if (card.matches(americanExpressRegex)) {
            System.out.println("AmericanExpress");
        } else {
            System.out.println("Card number does not exist");
        }
    }

}
