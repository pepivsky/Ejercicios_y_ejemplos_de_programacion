package com.company;

import java.util.Scanner;

public class Regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ip = scanner.nextLine();

        //String regex = "[0-255\\.]{3}[0-255]";
        //String regex = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
        //String regex = "[12][1-5][1-5]"; //mal
        //String regex = "\\b(\\d|1[0-2])";
        //String regex = "^(0?[0-9]{1,2}|1[0-7][0-9]|255)\\.$"; //funciona para 255.
        //String regex = "^([01][0-9][0-9]|2[0-4][0-9]|25[0-5]\\.){3}[01][0-9][0-9]|2[0-4][0-9]|25[0-5]$"; //funciona en el checador

        //String regex = "^([01][0-9][0-9]|2[0-4][0-9]|25[0-5])\\.([01][0-9][0-9]|2[0-4][0-9]|25[0-5])\\.([01][0-9][0-9]|2[0-4][0-9]|25[0-5])\\.([01][0-9][0-9]|2[0-4][0-9]|25[0-5])$";
        //String regex = "^([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])$"; //bien
        String regex = "^(([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.){3}([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])$";
        String isMatch = (ip.matches(regex))?"YES":"NO";

        System.out.println(isMatch);
    }
}
