package com.company.regexExamples;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * For a given number N and a line with text, output "YES" if this line contains a word with exactly N symbols, otherwise output "NO".
 *
 * A word can contain only symbols of the English alphabet.
 *
 * Hint
 *
 * The previous statement also means that there can't be any digits inside a word.
 *  Report a typo
 * Sample Input 1:
 *
 * 3
 * Java is the most popular programming language
 * Sample Output 1:
 *
 * YES
 * Sample Input 2:
 *
 * 11
 * Regular expression is hard to read, isnt it?
 * Sample Output 2:
 *
 * NO
 * Sample Input 3:
 *
 * 4
 * Wow! How awesome is that!
 * Sample Output 3:
 *
 * YES
 * */
public class FindAWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();

        //usando delimitadores de palabra indicamos que debe empezar o terminar con la cadena ingresada
        //para que haga match solo con la ocurrencia especificada
        Pattern pattern = Pattern.compile("\\b[a-zA-Z]" + "{" + size + "}" + "\\b");

        Matcher matcher = pattern.matcher(line);
        //metodo find que busca varios matches en la linea
        System.out.println(matcher.find() ? "YES" : "NO");
    }
}
