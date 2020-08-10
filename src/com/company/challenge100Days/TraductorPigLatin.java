package com.company.challenge100Days;

import java.util.Scanner;

public class TraductorPigLatin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la palabra para traducirla");
        String word = scanner.next();
        char firstLetter = word.charAt(0); //Extraer la primera letra
        String newWord = "";
        int wordLength = 0;

        if ("aeiouAEIOU".contains(Character.toString(firstLetter))) { //revisar si la primera es vocal
            newWord = word + "way";

        } else { //es consonante
            wordLength = word.length();
            newWord = word.substring(1,wordLength);
            newWord = newWord + firstLetter + "ay";
        }
        System.out.println(newWord);
    }
}
