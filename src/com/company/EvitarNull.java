package com.company;

import java.util.Scanner;

public class EvitarNull {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        string = "null".equals(string) ? null : string;
        System.out.println(string);
        /* Do not change code above */
        if (string.equals("")) {
            System.out.println("NPE!");
        } else {


            //System.out.println(string);
        }

    }
}
