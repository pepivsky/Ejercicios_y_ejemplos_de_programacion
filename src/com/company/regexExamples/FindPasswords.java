package com.company.regexExamples;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindPasswords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;

        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("(password:*\\s*[A-Za-z\\d]+)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);


        while (matcher.find()) { //mientras encuentre coincidencias va a imprimir los passwords que hagan match
            System.out.println(matcher.group().replaceFirst("(password:)|(PASSWORD:)|(password)|(PASSWORD)|(PAssWoRd)", " ").trim()); //matcher. gropu extrae la cadena que hace match
            flag = true;
        }

        if (!flag) { // si no hay concidencias muestra el mensaje
            System.out.println("No passwords found.");
        }
    }
}
