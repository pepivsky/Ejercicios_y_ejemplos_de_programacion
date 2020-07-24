package com.company;

import java.util.Scanner;

public class PracticaChar {
    public static boolean isVowel(char ch) {
        return "aeiouAEIOU".contains(Character.toString(ch));

    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}
