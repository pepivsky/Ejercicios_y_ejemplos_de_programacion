package com.company.regexExamples;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int size = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();

        String regex = "[^\\s][a-zA-z]{3}";
        //String regex = "[a-zA-z]" + "{" + size + "}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);

        System.out.println(matcher.find() ? "YES" : "NO");
    }
}
