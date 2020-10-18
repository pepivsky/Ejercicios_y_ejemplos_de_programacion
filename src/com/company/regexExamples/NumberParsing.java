package com.company.regexExamples;

import java.util.Scanner;

/**
 * You need to write a regular expression that can match any number.
 *
 * A number can be positive or negative. If it is negative, then it should start with a '-'. If it is positive, it may start with a '+'. If it doesn't start with either '+' or '-' it is considered positive.
 *
 * A number representation can't be padded with leading zeroes. For example, 001 is not a valid number (but 0 is).
 *
 * A number can have a fractional part. A delimiter between an integer part and a fractional part can be either a dot . or a comma ,. A fractional part can't be padded with trailing zeros: for example, 1.01 and 1.0 are valid numbers, but 1.00 and 1.10 are not.
 *
 * Output "YES" if a given string is a valid number, otherwise output "NO".
 *
 *  Report a typo
 * Sample Input 1:
 *
 * 123
 * Sample Output 1:
 *
 * YES
 * Sample Input 2:
 *
 * 0123
 * Sample Output 2:
 *
 * NO
 * Sample Input 3:
 *
 * -56.0
 * Sample Output 3:
 *
 * YES
 * Sample Input 4:
 *
 * -0,05
 * Sample Output 4:
 *
 * YES
 * Sample Input 5:
 *
 * -23.230
 * Sample Output 5:
 *
 * NO
 * Sample Input 6:
 *
 * +12376352189432535347623423443417,36817231873134176345178234234234234
 * Sample Output 6:
 *
 * YES
 * */
public class NumberParsing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^(^[\\-\\+]?\\d+[\\.\\,]\\d+[1-9]$)|(^[1-9]+$)|(^[\\-\\+]?\\d+[\\.\\,]\\d$)|(^[\\+\\-]?[1-9]+$)$";

        String number = scanner.nextLine();
        System.out.println(number.matches(regex) ? "YES" : "NO");
    }
}
