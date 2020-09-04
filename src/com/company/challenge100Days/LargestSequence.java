package com.company.challenge100Days;


import java.util.Scanner;
/**
 * Given the sequence of integer numbers (which ends with the number 0). Find the largest element of the sequence.
 *
 * The number 0 itself is not included in the sequence but serves only as a sign of the sequence’s end.
 *
 * Sample Input 1:
 *
 * 1
 * 7
 * 9
 * 0
 * Sample Output 1:
 *
 * 9
 * */
public class LargestSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int max = number;

        while (number != 0) {
            if (max < number) {
                max = number;
            }
            number = scanner.nextInt();
        }

        System.out.println(max);



    }
}
