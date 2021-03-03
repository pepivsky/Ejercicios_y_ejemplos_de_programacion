package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeRegex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /*int lines = scanner.nextInt();
        scanner.nextLine();*/

        /*String[] arrayTags = new String[lines];

        for (int i = 0; i < lines; i++) {
            arrayTags[i] = scanner.nextLine();
        }*/

        String tag = scanner.nextLine();
        Pattern pattern = Pattern.compile("<(a|b|p|div).*?>[A-Za-z ]*<\\/\\1>");
        Matcher matcher = pattern.matcher(tag);

        int i = 0;
        while (matcher.find()) {
            i++;

        }

        System.out.println(i);

    }
}
