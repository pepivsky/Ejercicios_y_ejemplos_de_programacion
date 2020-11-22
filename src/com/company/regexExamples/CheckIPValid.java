package com.company.regexExamples;

import java.util.Scanner;
/*
revisar si una ip es valida
 */
public class CheckIPValid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ip = scanner.nextLine();

        String regex = "^(([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.){3}([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])$";
        String isMatch = (ip.matches(regex))?"YES":"NO";

        System.out.println(isMatch);
    }
}
