package com.company.regexExamples;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* Revisando si el password contiene al menos una letra minuscula, muna mayuscula y un digito
Safe password
The password is hard to crack if it contains at least one uppercase letter, at least one lowercase letter, at least one digit and includes 12 or more symbols. For a given string you should output "YES" if this password is hard to crack, otherwise output "NO".

Hint

Note that it's convenient to complete this task by using several separate regexes.

Sample Input:
Password1234

Sample Output:
YES


Sample Input:
SuperSecretPass

Sample Output:
NO
 */

/*
Use a non-consuming regular expression.

The typical (i.e. Perl/Java) notation is:

(?=expr)

This means "match expr but after that continue matching at the original match-point."

You can do as many of these as you want, and this will be an "and." Example:

(?=match this expression)(?=match this too)(?=oh, and this) //evalua todas las expresiones al mismo tiempo (le texto debe hacer match con todas), es equivalente a AND

You can even add capture groups inside the non-consuming expressions if you need to save some of the data therein.
 */
public class SafePassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z]).{12,}$");//regex (?=match this expression)(?=match this too)(?=oh, and this)
        Matcher matcher = pattern.matcher(text);

        System.out.println(matcher.find() ? "YES" : "NO");
    }
}
