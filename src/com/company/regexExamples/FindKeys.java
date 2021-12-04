package com.company.regexExamples;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Check the essay
Write a program that extracts and outputs all "keys" from a string.

The key is a set of characters surrounded by spaces. The key can be of two types:

containing digits and/or upper- and lowercase English consonants in any combination;
containing special symbols ?!# and/or upper- and lowercase English vowels in any combinations. Note that y is considered to be a consonant in this task.
The key always follows the phrase the key is , which can be written in upper- and/or lowercase letters. Each word can be separated by any number of whitespace, including the key-word itself.

Output all keys found in the string, each key on a new line.

Be careful, the key is always surrounded by spaces or the input string ends with the key (see the second input).
For example, the string "The key is d123." won't contain any keys.

Try to use Matcher and Pattern to solve it. All the needed modules are already imported.

Sample Input:
The    keY    is     ggYYY3564   THE    key IS ffFF23c!

Sample Output:
ggYYY3564


Sample Input:
The    key    IS     ggYiYY3564   The    KEY  is     AAAAAaaaa!!!!

Sample Output:
AAAAAaaaa!!!!
 */
public class FindKeys {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        // write your code here
        Pattern patternType1 = Pattern.compile("(?<=[IiSs]\\b)\\s+[?!#aeiouAEIOU]{2,}\\s");
        Matcher matcherType1 = patternType1.matcher(text);

        Pattern patternType2 = Pattern.compile("(?<=[IiSs]\\b)\\s+[0-9BCDFGJKLMNPQSTVXZHRWYbcdfgjklmnpqstvxzhrwy]{2,}\\s");
        Matcher matcherType2 = patternType2.matcher(text);

        boolean flag;
        do {
            flag = false;
            if (matcherType2.find()) {
                System.out.println(matcherType2.group().trim());
                flag = true;
            }

            if (matcherType1.find()) {
                System.out.println(matcherType1.group().trim());
                flag = true;
            }
        } while (flag);
    }
}
