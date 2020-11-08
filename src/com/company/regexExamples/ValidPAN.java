package com.company.regexExamples;

import java.util.ArrayList;
import java.util.Scanner;

/*
Your task is to figure out if the PAN number is valid or not. A valid PAN number will have all its letters in uppercase and digits in the same order as listed above.

Input Format

First line contains .  lines follow, each having a PAN number.

Constraints

Each char is an uppercase letter, i.e., .
Each digit lies between 0 and 9, i.e., .
The length of the PAN number is always 10, i.e.,
Every character in PAN is either char or digit satisfying the above constraints.
Output Format

For every PAN number listed, print YES if it is valid and NO if it isn't.

Sample Input

3
ABCDS1234Y
ABAB12345Y
avCDS1234Y
Sample Output

YES
NO
NO
 */
public class ValidPAN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); //numero de entradas
        String pan;
        ArrayList<String> pans = new ArrayList<>();

        for (int i = 0; i < n; i++) { //guarda las entradas en un arrayList
            pan = scanner.next();
            pans.add(pan);
        }

        for (int i = 0; i < n; i++) { //recorre el arrayList y compara con la regex
            System.out.println(pans.get(i).matches("^[A-Z]{5}\\d{4}[A-Z]$") ? "YES" : "NO"); //si hace match miprime yes
        }

        /*
        ABCDS1234Y
        ABAB12345Y
        avCDS1234Y
         */

    }
}
